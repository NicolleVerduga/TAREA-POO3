package poo;
import java.util.ArrayList;
import uni1a.ContenidoAudiovisual;


public class Pelicula extends ContenidoAudiovisual { //Subclase película que extiende de ContenidoAudiovisual
    private String estudio;
    private ArrayList<Actor> actores;//Asociación con actor

    //construtor para inicializar atributos
    public Pelicula(String titulo, int duracionEnMinutos, String genero, String estudio){
        super (titulo, duracionEnMinutos, genero);
        this.estudio = estudio;
        this.actores = new ArrayList<>(); //Lista de actores vacía
    }
    public void agregarActor(Actor actor){
        actores.add(actor);
    }
    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
    //Implementación de método abstracto para mostrar detalles
    @Override
    public void mostrarDetalles(){
        System.out.println("Detalles de la pelicula: ");
        System.out.println("ID: " + getId());
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Duracion en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Estudio: " +getEstudio());
        System.out.println("Actores: " +actores);
        System.out.println();
    }

}

