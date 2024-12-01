package poo;
import java.util.ArrayList;
import uni1a.ContenidoAudiovisual;

public class SerieDeTV extends ContenidoAudiovisual {//Subclase SerieDeTv que extiende de ContenidoAudiovisual
    private int temporadas;
    private ArrayList<Temporada> listaTemporadas; //Agregacion con Temporada


    public SerieDeTV(String titulo, int duracionEnMinutos, String genero){
        super (titulo, duracionEnMinutos, genero);
        this.temporadas = temporadas;
        this.listaTemporadas = new ArrayList<>();
    }
    public void agregarTemporada(Temporada temporada){
        listaTemporadas.add(temporada);
    }
    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
    //Implementación de método abstracto para mostrar detalles
    @Override
    public void mostrarDetalles(){
        System.out.println("Detalles de la Serie de Tv: ");
        System.out.println("ID: " + getId());
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Duracion en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Temporadas: " +getTemporadas());
        System.out.println("Lista de temporadas: ");
        System.out.println();
    }
}
