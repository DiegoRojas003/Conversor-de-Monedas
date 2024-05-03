package com.conversorDeMonedas.operaciones;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Coneccion {
    public String solicitarMoneda(String moneda){
        String url="https://v6.exchangerate-api.com/v6/dd7065e3df514b6cde271266/latest/"+moneda;
        try{
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();
        }catch (Exception e){
            System.out.println("Error"+e);
        }
        return "error";
    }

}
