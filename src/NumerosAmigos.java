import java.util.Scanner;

public class NumerosAmigos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el número de inicio:");
        int inicio = input.nextInt();
        System.out.println("Ingrese el número de fin:");
        int fin = input.nextInt();

        if (inicio > fin) {
            System.out.println("Entrada no válida. El inicio debe ser menor o igual al fin.");
            input.close();
            return;
        }

        System.out.println("Números amigos encontrados:");
        boolean encontrado = false;

        for (int i = Math.max(2, inicio); i <= fin; i++) {
            int contadorDivisores = 0;

            // Contamos los divisores del número
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    contadorDivisores++;
                }
            }

            // Verificamos si tiene exactamente 4 divisores: 1, el número, y dos adicionales
            if (contadorDivisores == 4) {
                encontrado = true;
                System.out.println(i + " es un número amigo.");
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron números amigos en el rango.");
        }

        input.close();
    }
}