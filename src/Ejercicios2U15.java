import java.util.Scanner;

public class Ejercicios2U15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int PARTIDOS = 6;
        final int EQUIPOS_POR_PARTIDO = 2;

        String[][] equipos = new String[PARTIDOS][EQUIPOS_POR_PARTIDO];
        int[][] resultados = new int[PARTIDOS][EQUIPOS_POR_PARTIDO];

        // Leer nombres de los equipos por partido
        System.out.println("Ingrese los nombres de los equipos para cada partido:");
        for (int i = 0; i < PARTIDOS; i++) {
            System.out.print("Partido " + (i + 1) + ", equipo 1: ");
            equipos[i][0] = scanner.nextLine();

            System.out.print("Partido " + (i + 1) + ", equipo 2: ");
            equipos[i][1] = scanner.nextLine();
        }

        // Leer resultados de goles por partido
        System.out.println("\nIngrese los goles de cada equipo por partido:");
        for (int i = 0; i < PARTIDOS; i++) {
            System.out.print("Goles " + equipos[i][0] + ": ");
            resultados[i][0] = scanner.nextInt();

            System.out.print("Goles " + equipos[i][1] + ": ");
            resultados[i][1] = scanner.nextInt();

            scanner.nextLine(); // limpiar buffer
        }

        // Mostrar resultados
        System.out.println("\nResultados de la quiniela:");
        for (int i = 0; i < PARTIDOS; i++) {
            System.out.printf("Partido %2d: %s %d - %d %s%n", 
                              (i + 1), 
                              equipos[i][0], resultados[i][0], 
                              resultados[i][1], equipos[i][1]);
        }

        scanner.close();
    }
}
