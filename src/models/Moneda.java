package models;

import DTO.MonedaDTO;

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
}
