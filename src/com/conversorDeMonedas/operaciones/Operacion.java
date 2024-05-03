package com.conversorDeMonedas.operaciones;

public class Operacion {


    public void operar(double valor, double divisaBase,String tDivisa){
        double resultado= valor*divisaBase;
        System.out.println("**********************************************");
        System.out.println("La conversión da como resultado: "+resultado+tDivisa);
        System.out.println("**********************************************");


    }
}
