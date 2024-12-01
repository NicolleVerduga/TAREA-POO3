package poo;

public class Temporada {
    private int numero;
    private int episodios;

    public int Temporada(int numero, int episodios){
        this.numero = numero;
        this.episodios = episodios;
        return numero;
    }

    public int getEpisodios() {
        return episodios;
    }
}
