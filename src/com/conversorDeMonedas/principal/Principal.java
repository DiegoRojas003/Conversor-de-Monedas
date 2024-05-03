package com.conversorDeMonedas.principal;

import com.conversorDeMonedas.operaciones.*;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Vista menu = new Vista();
        Coneccion coneccion = new Coneccion();
        FiltrarDivisa filtro = new FiltrarDivisa();
        Operacion operaracion= new Operacion();
        CreadorJson crearjson = new CreadorJson();
        LectorJson lector = new LectorJson();
        //variables
        int opcion=0;
        double valor,divisaBase;
        String json;
        String tipoDivisaBase="d";
        String tipoDivisaObjetivo="d";


        menu.menuInicial();
        while(opcion != 9){
            try{
                menu.menuPrincipal();
                opcion = teclado.nextInt();
                if (opcion >= 0 && opcion < 7) {
                    System.out.println("Por favor digite el valor a convertir");
                    valor = teclado.nextDouble();
                } else {
                    valor = 0;
                }

                switch (opcion) {
                    case 1:
                        tipoDivisaBase="USD";
                        tipoDivisaObjetivo="COP";
                        json = coneccion.solicitarMoneda(tipoDivisaBase);
                        divisaBase = filtro.consultarDivisa(json, tipoDivisaObjetivo);
                        operaracion.operar(valor, divisaBase, " COP (Peso Colombiano)");
                        break;
                    case 2:
                        tipoDivisaBase="COP";
                        tipoDivisaObjetivo="USD";
                        json = coneccion.solicitarMoneda(tipoDivisaBase);
                        divisaBase = filtro.consultarDivisa(json, tipoDivisaObjetivo);
                        operaracion.operar(valor, divisaBase, " USD (Dolar Estadounidense)");
                        break;
                    case 3:
                        tipoDivisaBase="USD";
                        tipoDivisaObjetivo="ARS";
                        json = coneccion.solicitarMoneda(tipoDivisaBase);
                        divisaBase = filtro.consultarDivisa(json, tipoDivisaObjetivo);
                        operaracion.operar(valor, divisaBase, " ARS (Peso Argentino)");
                        break;
                    case 4:
                        tipoDivisaBase="ARS";
                        tipoDivisaObjetivo="USD";
                        json = coneccion.solicitarMoneda(tipoDivisaBase);
                        divisaBase = filtro.consultarDivisa(json, tipoDivisaObjetivo);
                        operaracion.operar(valor, divisaBase, " USD (Dolar Estadounidense)");
                        break;
                    case 5:
                        tipoDivisaBase="USD";
                        tipoDivisaObjetivo="BRL";
                        json = coneccion.solicitarMoneda(tipoDivisaBase);
                        divisaBase = filtro.consultarDivisa(json, tipoDivisaObjetivo);
                        operaracion.operar(valor, divisaBase, " BRL (Real Brasileño)");
                        break;
                    case 6:
                        tipoDivisaBase="BRL";
                        tipoDivisaObjetivo="USD";
                        json = coneccion.solicitarMoneda(tipoDivisaBase);
                        divisaBase = filtro.consultarDivisa(json, tipoDivisaObjetivo);
                        operaracion.operar(valor, divisaBase, " USD (Dolar Estadounidense)");
                        break;
                    case 7:
                        lector.leerJsonYMostrar();
                        break;
                    case 8:
                        for(int i=0;i<30;i++){
                            System.out.println("");
                        }
                        break;
                    case 9:
                        break;
                    default:
                        System.out.println("Valor no valido");
                }
                String fecha = String.valueOf(LocalDate.now());
                String hora = String.valueOf(LocalTime.now());
                crearjson.crearJson(fecha, hora, tipoDivisaBase,tipoDivisaObjetivo,valor);
                Thread.sleep(3500);
            }catch (InputMismatchException e){
                System.out.println("Error, digite valores numericos.");
                teclado.nextLine();
            }catch (Exception e){
                System.out.println("Error"+e);
            }

        }


    }
}
