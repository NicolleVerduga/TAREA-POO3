package poo;
import java.util.ArrayList;
import uni1a.ContenidoAudiovisual;

public class Documental extends ContenidoAudiovisual {//Subclase documental que extiende de ContenidoAudiovisual
    private  String tema;
    private ArrayList <Investigador> investigadores; //Composicion con investigador

    public Documental(String titulo, int duracionEnMinutos, String genero, String tema){
        super (titulo, duracionEnMinutos, genero);
        this.tema = tema;
        this.investigadores = new ArrayList<>();
    }
    public void agregarInvestigador(Investigador investigador){
        investigadores.add(investigador);
    }
    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
    //Implementación de método abstracto para mostrar detalles
    @Override
    public void mostrarDetalles(){
        System.out.println("Detalles del Documental: ");
        System.out.println("ID: " + getId());
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Duracion en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Tema: " +getTema());
        System.out.println("Investigador" +investigadores);

    }
}

