import java.util.Scanner;

public class Ejercicios2U9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int DIAS = 5;
        double[] tempMin = new double[DIAS];
        double[] tempMax = new double[DIAS];

        // Lectura de temperaturas
        for (int i = 0; i < DIAS; i++) {
            System.out.println("Día " + (i + 1) + ":");
            System.out.print("  Temperatura mínima: ");
            tempMin[i] = scanner.nextDouble();

            System.out.print("  Temperatura máxima: ");
            tempMax[i] = scanner.nextDouble();
        }

        // Mostrar temperatura media de cada día
        System.out.println("\nTemperatura media de cada día:");
        for (int i = 0; i < DIAS; i++) {
            double media = (tempMin[i] + tempMax[i]) / 2;
            System.out.printf("Día %d: %.2f°C%n", i + 1, media);
        }

        // Encontrar la temperatura mínima global (menor temperatura mínima)
        double tempMinGlobal = tempMin[0];
        for (int i = 1; i < DIAS; i++) {
            if (tempMin[i] < tempMinGlobal) {
                tempMinGlobal = tempMin[i];
            }
        }

        // Mostrar los días con la temperatura mínima global
        System.out.println("\nDía(s) con la temperatura mínima más baja (" + tempMinGlobal + "°C):");
        for (int i = 0; i < DIAS; i++) {
            if (tempMin[i] == tempMinGlobal) {
                System.out.println("Día " + (i + 1));
            }
        }

        // Leer temperatura para buscar en máximas
        System.out.print("\nIngrese una temperatura para buscar días con esa temperatura máxima: ");
        double tempBuscada = scanner.nextDouble();

        boolean encontrada = false;
        System.out.println("Día(s) con temperatura máxima igual a " + tempBuscada + "°C:");
        for (int i = 0; i < DIAS; i++) {
            if (tempMax[i] == tempBuscada) {
                System.out.println("Día " + (i + 1));
                encontrada = true;
            }
        }

        if (!encontrada) {
            System.out.println("No existe ningún día con esa temperatura máxima.");
        }

        scanner.close();
    }
}
