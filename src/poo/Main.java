package poo;

import java.lang.ModuleLayer.Controller;

public class Main {
    public static <PeliculaController, PeliculaView> void main(String[] args) {
        // Crear el modelo (gestión de datos)
        model.PeliculaModel model;
        model = new model.PeliculaModel();

        // Crear el controlador, pasándole el modelo
        PeliculaController controller;
        controller = new PeliculaController();

        // Crear la vista, pasándole el controlador
        PeliculaView view = new PeliculaView(controller);

        // Iniciar la interacción con el usuario
        view.toString();
    }
}
