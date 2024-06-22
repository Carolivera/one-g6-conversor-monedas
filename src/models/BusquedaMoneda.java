package models;

import DTO.MonedaDTO;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BusquedaMoneda {
    //Esta clase recupera la abreviatura de la moneda y hace la consulta a la API
    public MonedaDTO monedaElegida(String abreviatura) {
        String direccion = "https://v6.exchangerate-api.com/v6/4641c70a1c853cd65f82f13a/latest/" + abreviatura;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), MonedaDTO.class);
        } catch (Exception e) {
            throw new RuntimeException("No fue posible realizar la conversión.");
        }
    }
}
