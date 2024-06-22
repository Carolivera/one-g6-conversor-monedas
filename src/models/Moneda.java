package models;

import DTO.MonedaDTO;

import java.util.Scanner;

public class Moneda {
    //atributos de la clase
    private String monedaElegida;
    private String monedaACambiar;
    private Double cantidadACambiar;
    private Double cantidadDeMonedaElegida;

    //constructores

    public Moneda() {
    }

    public Moneda(MonedaDTO monedaDTO) {
        this.monedaElegida = monedaDTO.base_code();
        this.monedaACambiar = String.valueOf(monedaDTO.getConversionRate(monedaACambiar));
    }

    public Moneda(String monedaElegida, String monedaACambiar, Double cantidadACambiar, Double cantidadDeMonedaElegida) {
        this.monedaElegida = monedaElegida;
        this.monedaACambiar = monedaACambiar;
        this.cantidadACambiar = cantidadACambiar;
        this.cantidadDeMonedaElegida = cantidadDeMonedaElegida;
    }

    //getters y setters
    public void setMonedaElegida(String monedaElegida) {
        this.monedaElegida = monedaElegida;
    }

    public String getMonedaElegida() {
        return monedaElegida;
    }

    public String getMonedaACambiar() {
        return monedaACambiar;
    }

    public void setMonedaACambiar(String monedaACambiar) {
        this.monedaACambiar = monedaACambiar;
    }

    public Double getCantidadACambiar() {
        return cantidadACambiar;
    }

    public void setCantidadACambiar(Double cantidadACambiar) {
        this.cantidadACambiar = cantidadACambiar;
    }

    public Double getCantidadDeMonedaElegida() {
        return cantidadDeMonedaElegida;
    }

    public void setCantidadDeMonedaElegida(Double cantidadDeMonedaElegida) {
        this.cantidadDeMonedaElegida = cantidadDeMonedaElegida;
    }
    public MonedaDTO buscarMoneda(String abreviatura){
        BusquedaMoneda nuevaBusqueda = new BusquedaMoneda();
        MonedaDTO monedaEncontrada = nuevaBusqueda.monedaElegida(abreviatura);
        return monedaEncontrada;
    }

    public String convertirMoneda(MonedaDTO monedaHallada, String monedaAConvertir){
        System.out.println("Ingresá el valor que deseas convertir: ");
        Scanner lectura = new Scanner(System.in);
        var cantidad = lectura.nextDouble();
        Double conversion = cantidad * monedaHallada.getConversionRate(monedaAConvertir);
        return "El valor " + cantidad + " " + monedaHallada.base_code() + " corresponde a "
                + conversion + " " + monedaAConvertir;
    }
}
