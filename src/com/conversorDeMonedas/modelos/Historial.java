package com.conversorDeMonedas.modelos;

public class Historial {
    private String fecha;
    private String hora;
    private String divisaBase;
    private String divisaObjetivo;
    private double divisaFinal;

    public Historial(String fecha, String hora, String divisaBase, String divisaObjetivo, double divisaFinal) {
        this.fecha = fecha;
        this.hora = hora;
        this.divisaBase = divisaBase;
        this.divisaObjetivo = divisaObjetivo;
        this.divisaFinal = divisaFinal;
    }
    
}
