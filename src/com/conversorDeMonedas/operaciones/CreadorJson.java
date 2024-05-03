package com.conversorDeMonedas.operaciones;

import com.conversorDeMonedas.modelos.Historial;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class CreadorJson {
    private static final String NOMBRE_ARCHIVO = "historial.json";
    private Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public void crearJson(String fecha, String hora, String divisaBase, String divisaObjetivo, double divisaFinal) {
        // Leer el contenido existente
        List<Historial> listaHistorial = leerHistorial();

        // Crear y agregar el nuevo objeto de historial
        Historial historialNuevo = new Historial(fecha, hora, divisaBase, divisaObjetivo, divisaFinal);
        listaHistorial.add(historialNuevo);

        // Escribir la lista completa de nuevo en el archivo
        try (FileWriter escritura = new FileWriter(NOMBRE_ARCHIVO)) { // Reescribe todo el archivo
            gson.toJson(listaHistorial, escritura); // Escribir toda la lista como JSON
        } catch (Exception e) {
            System.out.println("Error al escribir en el archivo JSON: " + e.getMessage());
        }
    }

    private List<Historial> leerHistorial() {
        // Definir el tipo de datos para la lista de objetos Historial
        Type listType = new TypeToken<List<Historial>>() {}.getType();

        try (FileReader lector = new FileReader(NOMBRE_ARCHIVO)) {
            return gson.fromJson(lector, listType); // Convierte el JSON en una lista de objetos
        } catch (Exception e) {
            return new ArrayList<>(); // Si el archivo no existe o está vacío, devuelve lista vacía
        }
    }

}
