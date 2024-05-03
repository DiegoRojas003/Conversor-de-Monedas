package com.conversorDeMonedas.operaciones;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class FiltrarDivisa {

    public double consultarDivisa(String json,String divisa){
        JsonObject object = JsonParser.parseString(json).getAsJsonObject();
        JsonObject conversionRates = object.getAsJsonObject("conversion_rates");
        return conversionRates.get(divisa).getAsDouble();



    }
}
