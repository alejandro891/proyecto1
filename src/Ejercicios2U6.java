import java.util.Scanner;

public class Ejercicios2U6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Vectores con nombres de meses y cantidad de días
        String[] nombresMeses = {
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };
        int[] diasMeses = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        // Pedir número de mes
        System.out.print("Ingrese un número de mes (1 a 12): ");
        int numeroMes = scanner.nextInt();

        // Validar entrada
        if (numeroMes >= 1 && numeroMes <= 12) {
            String nombre = nombresMeses[numeroMes - 1];
            int dias = diasMeses[numeroMes - 1];

            System.out.println("📅 El mes de " + nombre + " tiene " + dias + " días.");
        } else {
            System.out.println("❌ Número de mes inválido. Debe estar entre 1 y 12.");
        }

        scanner.close();
    }
}
