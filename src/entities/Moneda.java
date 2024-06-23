package entities;

import java.time.LocalDateTime;

public class Moneda {
    private String monedaBase;
    private String monedaObjetivo;
    private Double cantidadACambiar;
    private Double cantidadEnMonedaObjetivo;
    private LocalDateTime tiempo;

    public Moneda() {
    }

    public Moneda(String monedaBase, String monedaObjetivo, Double cantidadACambiar, Double cantidadEnMonedaObjetivo, LocalDateTime tiempo) {
        this.monedaBase = monedaBase;
        this.monedaObjetivo = monedaObjetivo;
        this.cantidadACambiar = cantidadACambiar;
        this.cantidadEnMonedaObjetivo = cantidadEnMonedaObjetivo;
        this.tiempo = tiempo;
    }

    public String getMonedaBase() {
        return monedaBase;
    }

    public void setMonedaBase(String monedaBase) {
        this.monedaBase = monedaBase;
    }

    public String getMonedaObjetivo() {
        return monedaObjetivo;
    }

    public void setMonedaObjetivo(String monedaObjetivo) {
        this.monedaObjetivo = monedaObjetivo;
    }

    public Double getCantidadACambiar() {
        return cantidadACambiar;
    }

    public void setCantidadACambiar(Double cantidadACambiar) {
        this.cantidadACambiar = cantidadACambiar;
    }

    public Double getCantidadEnMonedaObjetivo() {
        return cantidadEnMonedaObjetivo;
    }

    public void setCantidadEnMonedaObjetivo(Double cantidadEnMonedaObjetivo) {
        this.cantidadEnMonedaObjetivo = cantidadEnMonedaObjetivo;
    }

    public LocalDateTime getTiempo() {
        return tiempo;
    }

    public void setTiempo(LocalDateTime tiempo) {
        this.tiempo = tiempo;
    }
}
