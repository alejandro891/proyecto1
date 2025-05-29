import java.util.Scanner;

public class Ejercicios2U8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nombres = new String[100];
        int[] edades = new int[100];
        int contador = 0;

        System.out.println("Introduce el nombre y la edad de cada alumno (usa '*' como nombre para finalizar):");

        while (true) {
            System.out.print("Nombre del alumno: ");
            String nombre = scanner.nextLine();

            if (nombre.equals("*")) {
                break;
            }

            System.out.print("Edad de " + nombre + ": ");
            int edad = Integer.parseInt(scanner.nextLine());

            nombres[contador] = nombre;
            edades[contador] = edad;
            contador++;
        }

        // Mostrar alumnos mayores de edad
        System.out.println("\n👨‍🎓 Alumnos mayores de edad (18 o más):");
        boolean hayMayoresEdad = false;
        for (int i = 0; i < contador; i++) {
            if (edades[i] >= 18) {
                System.out.println(nombres[i] + " - " + edades[i] + " años");
                hayMayoresEdad = true;
            }
        }
        if (!hayMayoresEdad) {
            System.out.println("Ningún alumno es mayor de edad.");
        }

        // Encontrar edad máxima
        int edadMaxima = -1;
        for (int i = 0; i < contador; i++) {
            if (edades[i] > edadMaxima) {
                edadMaxima = edades[i];
            }
        }

        // Mostrar alumnos con la edad máxima
        System.out.println("\n🏆 Alumnos con mayor edad (" + edadMaxima + " años):");
        for (int i = 0; i < contador; i++) {
            if (edades[i] == edadMaxima) {
                System.out.println(nombres[i]);
            }
        }

        scanner.close();
    }
}
