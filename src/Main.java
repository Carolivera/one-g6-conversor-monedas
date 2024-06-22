import DTO.MonedaDTO;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import models.BusquedaMoneda;
import models.Moneda;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String opcionMenu = "";
        Scanner lectura = new Scanner(System.in);
        String menu = """
                1) Dólar a peso argentino
                2) Peso argentino a dólar
                3) Dólar a real
                4) Real a dólar
                5) Dólar a peso colombiano
                6) Peso colombiano a dólar
                7) Salir
                """;

        //Creación objeto gson
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        //Interacción con el usuario
        while (true) {
            System.out.println("Te damos la bienvenida al conversor de monedas :)");
            System.out.println("Elige una de estas opciones:");
            System.out.println(menu);
            opcionMenu = lectura.nextLine();
            if (opcionMenu.equalsIgnoreCase("7")) {
                System.out.println("¡Muchas gracias por usar nuestro conversor!");
                break;
            } else {
                Moneda busquedaUsuario = new Moneda();
                switch (opcionMenu) {
                    case "1":
                        busquedaUsuario.setMonedaElegida("ARS");
                        String abr = busquedaUsuario.getMonedaElegida();
                        System.out.println("La moneda elegida es " + busquedaUsuario.getMonedaElegida());
                        busquedaUsuario.setMonedaACambiar("USD");
                        MonedaDTO monedaHallada = busquedaMoneda(abr);
                        break;
                    case "2":
                        busquedaUsuario.setMonedaElegida("USD");
                        System.out.println("La moneda elegida es " + busquedaUsuario.getMonedaElegida());
                        busquedaUsuario.setMonedaACambiar("ARS");
                        String abr2 = busquedaUsuario.getMonedaElegida();
                        busquedaMoneda(abr2);
                        break;
                    case "3":
                        busquedaUsuario.setMonedaElegida("USD");
                        System.out.println("La moneda elegida es " + busquedaUsuario.getMonedaElegida());
                        busquedaUsuario.setMonedaACambiar("BRL");
                        String abr3 = busquedaUsuario.getMonedaElegida();
                        busquedaMoneda(abr3);
                        break;
                    case "4":
                        busquedaUsuario.setMonedaElegida("BRL");
                        System.out.println("La moneda elegida es " + busquedaUsuario.getMonedaElegida());
                        busquedaUsuario.setMonedaACambiar("USD");
                        String abr4 = busquedaUsuario.getMonedaElegida();
                        busquedaMoneda(abr4);
                        break;
                    case "5":
                        busquedaUsuario.setMonedaElegida("USD");
                        System.out.println("La moneda elegida es " + busquedaUsuario.getMonedaElegida());
                        busquedaUsuario.setMonedaACambiar("COP");
                        String abr5 = busquedaUsuario.getMonedaElegida();
                        busquedaMoneda(abr5);
                        break;
                    case "6":
                        busquedaUsuario.setMonedaElegida("COP");
                        System.out.println("La moneda elegida es " + busquedaUsuario.getMonedaElegida());
                        busquedaUsuario.setMonedaACambiar("USD");
                        String abr6 = busquedaUsuario.getMonedaElegida();
                        busquedaMoneda(abr6);
                        break;
                }
                System.out.println("Ingresá el valor que deseas convertir: ");
                var cantidad = lectura.nextDouble();
            }
        }

    }
    private static MonedaDTO busquedaMoneda(String abreviatura){
        BusquedaMoneda nuevaBusqueda = new BusquedaMoneda();
        MonedaDTO monedaEncontrada = nuevaBusqueda.monedaElegida(abreviatura);
        System.out.println(monedaEncontrada);
        return monedaEncontrada;
    }
}

