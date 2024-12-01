package poo;

import java.util.ArrayList;
import java.util.List;

// Clase Actor
public class Actor {
    private String nombre;
    private int edad;

    public Actor(String nombre, int edad) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del actor no puede ser nulo o vacío.");
        }
        this.nombre = nombre;
        this.edad = edad;
    }

    public Actor(String dato) {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return nombre + " (" + edad + " años)";
    }
}
