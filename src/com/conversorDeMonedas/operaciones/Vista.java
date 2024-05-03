package com.conversorDeMonedas.operaciones;

public class Vista {
    public void menuInicial(){
            System.out.print("""
                    **************************************************************
                    Bienvenido al conversor de monedas/ Create by: Diego Alejandro
                    **************************************************************
                    """);
    }
    public void menuPrincipal(){
            System.out.println("""
                    Seleccione la opción, escribiendo el numero correspondiente:
                    1. Dolar => Peso Colombiano
                    2. Peso Colombiano => Dolar
                    3. Dolar => Peso Argentino
                    4. Peso Argentino => Dolar
                    5. Dolar => Real Brasileño
                    6. Peso Brasileño => Dolar
                    7. Mostrar Historial
                    8. Limpiar
                    9. Salir""");
    }
    public void menuValor(){
        System.out.println("Digite el valor que desea convertir");
    }
}
