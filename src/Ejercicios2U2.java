import java.util.Scanner;

public class Ejercicios2U2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] vectorOriginal = new String[5];
        String[] vectorInverso = new String[5];

        // Leer datos desde el teclado
        System.out.println("Ingrese 5 cadenas de texto:");
        for (int i = 0; i < vectorOriginal.length; i++) {
            System.out.print("Cadena " + (i + 1) + ": ");
            vectorOriginal[i] = scanner.nextLine();
        }

        // Copiar en orden inverso
        for (int i = 0; i < vectorOriginal.length; i++) {
            vectorInverso[i] = vectorOriginal[vectorOriginal.length - 1 - i];
        }

        // Mostrar los vectores
        System.out.println("\nVector original:");
        for (String s : vectorOriginal) {
            System.out.println(s);
        }

        System.out.println("\nVector en orden inverso:");
        for (String s : vectorInverso) {
            System.out.println(s);
        }

        scanner.close();
    }
}
