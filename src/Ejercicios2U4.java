import java.util.Scanner;

public class Ejercicios2U4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int contador = 0;

        System.out.println("Ingrese hasta 10 números enteros (se detiene con un número negativo):");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                System.out.println("❌ Número negativo detectado. Fin de la entrada.");
                break;
            }

            numeros[i] = numero;
            contador++;
        }

        // Imprimir los elementos introducidos
        System.out.println("\n📋 Números ingresados:");
        for (int i = 0; i < contador; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + numeros[i]);
        }

        scanner.close();
    }
}
