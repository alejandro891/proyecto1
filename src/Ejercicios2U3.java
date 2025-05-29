import java.util.Scanner;

public class Ejercicios2U3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[5];

        // Leer 5 notas entre 0 y 10
        for (int i = 0; i < notas.length; i++) {
            while (true) {
                System.out.print("Ingrese la nota " + (i + 1) + " (0 a 10): ");
                double nota = scanner.nextDouble();
                if (nota >= 0 && nota <= 10) {
                    notas[i] = nota;
                    break;
                } else {
                    System.out.println("❌ Nota inválida. Intente nuevamente.");
                }
            }
        }

        // Mostrar todas las notas
        System.out.println("\nNotas ingresadas:");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }

        // Calcular nota media, mayor y menor
        double suma = 0;
        double mayor = notas[0];
        double menor = notas[0];

        for (double nota : notas) {
            suma += nota;
            if (nota > mayor) {
                mayor = nota;
            }
            if (nota < menor) {
                menor = nota;
            }
        }

        double media = suma / notas.length;

        System.out.println("\n📊 Resultados:");
        System.out.println("Nota media: " + media);
        System.out.println("Nota más alta: " + mayor);
        System.out.println("Nota más baja: " + menor);

        scanner.close();
    }
}
