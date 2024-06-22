import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import models.Moneda;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String opcionMenu = "";
        Scanner lectura = new Scanner(System.in);
        String menu = """
                1) Peso argentino a dólar
                2) Dólar a peso argentino
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
                        busquedaUsuario.setMonedaACambiar("USD");
                        System.out.println(busquedaUsuario.convertirMoneda(busquedaUsuario.buscarMoneda(busquedaUsuario.getMonedaElegida()),
                                busquedaUsuario.getMonedaACambiar()));
                        break;
                    case "2":
                        busquedaUsuario.setMonedaElegida("USD");
                        busquedaUsuario.setMonedaACambiar("ARS");
                        System.out.println(busquedaUsuario.convertirMoneda(busquedaUsuario.buscarMoneda(busquedaUsuario.getMonedaElegida()),
                                busquedaUsuario.getMonedaACambiar()));
                        break;
                    case "3":
                        busquedaUsuario.setMonedaElegida("USD");
                        busquedaUsuario.setMonedaACambiar("BRL");
                        System.out.println(busquedaUsuario.convertirMoneda(busquedaUsuario.buscarMoneda(busquedaUsuario.getMonedaElegida()),
                                busquedaUsuario.getMonedaACambiar()));
                        break;
                    case "4":
                        busquedaUsuario.setMonedaElegida("BRL");
                        busquedaUsuario.setMonedaACambiar("USD");
                        System.out.println(busquedaUsuario.convertirMoneda(busquedaUsuario.buscarMoneda(busquedaUsuario.getMonedaElegida()),
                                busquedaUsuario.getMonedaACambiar()));
                        break;
                    case "5":
                        busquedaUsuario.setMonedaElegida("USD");
                        busquedaUsuario.setMonedaACambiar("COP");
                        System.out.println(busquedaUsuario.convertirMoneda(busquedaUsuario.buscarMoneda(busquedaUsuario.getMonedaElegida()),
                                busquedaUsuario.getMonedaACambiar()));
                        break;
                    case "6":
                        busquedaUsuario.setMonedaElegida("COP");
                        busquedaUsuario.setMonedaACambiar("USD");
                        System.out.println(busquedaUsuario.convertirMoneda(busquedaUsuario.buscarMoneda(busquedaUsuario.getMonedaElegida()),
                                busquedaUsuario.getMonedaACambiar()));
                        break;
                }
            }
        }
    }
}

