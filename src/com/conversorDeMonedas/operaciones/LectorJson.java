package com.conversorDeMonedas.operaciones;
import com.conversorDeMonedas.modelos.Historial;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class LectorJson {
    private static final String NOMBRE_ARCHIVO = "historial.json";
    private Gson gson = new GsonBuilder().setPrettyPrinting().create(); // Para un formato legible

    public void leerJsonYMostrar() {
        Type listType = new TypeToken<List<Historial>>() {}.getType(); // Tipo de lista de objetos Historial

        try (FileReader lector = new FileReader(NOMBRE_ARCHIVO)) {
            List<Historial> listaHistorial = gson.fromJson(lector, listType); // Deserializar a lista

            // Mostrar el contenido en la consola
            System.out.println("Historial:");
            System.out.println(gson.toJson(listaHistorial)); // Imprimir con formato bonito
        } catch (IOException e) {
            System.out.println("Error al leer el archivo JSON: " + e.getMessage());
        }
    }
}

