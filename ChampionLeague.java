import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ChampionLeague {
    private String etapaActual;
    private List<String> equipos;

    public ChampionLeague() {
        this.equipos = new ArrayList<>();
    }

    // Método para preguntar la etapa
    public void preguntarEtapa() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la etapa actual (octavos, cuartos, semifinales): ");
        this.etapaActual = scanner.nextLine();
        System.out.println("Etapa seleccionada: " + this.etapaActual);
    }

    // Método para establecer el número de equipos según la etapa
    public void establecerNumeroDeEquipos() {
        Scanner scanner = new Scanner(System.in);
        int cantidadEquipos = 0;

        // Establecer la cantidad de equipos según la etapa seleccionada
        switch (etapaActual) {
            case "octavos":
                cantidadEquipos = 16;
                break;
            case "cuartos":
                cantidadEquipos = 8;
                break;
            case "semifinales":
                cantidadEquipos = 4;
                break;
            case "final":
                cantidadEquipos = 2;
                break;
            default:
                System.out.println("Etapa no válida.");
                return;
        }

        // Solicitar los equipos para la etapa seleccionada
        System.out.println("Para la etapa de " + etapaActual + ", debe haber " + cantidadEquipos + " equipos.");
        // Validar que el número de equipos coincida con el que debe haber en esa etapa
        if (etapaActual.equals("octavos") || etapaActual.equals("cuartos") || etapaActual.equals("semifinales") || etapaActual.equals("final")) {
            equipos.clear();  // Limpiar la lista de equipos previa

            for (int i = 1; i <= cantidadEquipos; i++) {
                System.out.println("Ingrese el nombre del equipo " + i + ": ");
                String nombreEquipo = scanner.nextLine();
                equipos.add(nombreEquipo);
            }

            System.out.println("Equipos ingresados para la etapa de " + etapaActual + ": " + equipos);
        }
    }

    // Método de sorteo para asignar enfrentamientos
    public void sorteoPartidos() {
        // Mezclar la lista de equipos aleatoriamente
        Collections.shuffle(equipos);

        System.out.println("Enfrentamientos para la etapa de " + etapaActual + ":");
        for (int i = 0; i < equipos.size(); i += 2) {
            String equipo1 = equipos.get(i);
            String equipo2 = equipos.get(i + 1);
            System.out.println(equipo1 + " vs " + equipo2);
        }
    }

    public static void main(String[] args) {
        ChampionLeague champions = new ChampionLeague();
        champions.preguntarEtapa();
        champions.establecerNumeroDeEquipos();
        champions.sorteoPartidos();
    }
}





