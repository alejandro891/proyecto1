import java.util.Scanner;

public class ejercicios2U14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int NUM_ARTICULOS = 5;
        final int NUM_SUCURSALES = 4;

        double[] precios = new double[NUM_ARTICULOS];
        int[][] cantidades = new int[NUM_ARTICULOS][NUM_SUCURSALES];

        // Leer precios de los artículos
        System.out.println("Ingrese los precios de los 5 artículos:");
        for (int i = 0; i < NUM_ARTICULOS; i++) {
            System.out.print("Precio artículo " + (i + 1) + ": ");
            precios[i] = scanner.nextDouble();
        }

        // Leer cantidades vendidas por cada sucursal y artículo
        System.out.println("\nIngrese las cantidades vendidas por cada sucursal:");
        for (int i = 0; i < NUM_ARTICULOS; i++) {
            for (int j = 0; j < NUM_SUCURSALES; j++) {
                System.out.print("Cantidad vendida del artículo " + (i + 1) + " en sucursal " + (j + 1) + ": ");
                cantidades[i][j] = scanner.nextInt();
            }
        }

        // 1. Cantidades totales de cada artículo
        int[] totalPorArticulo = new int[NUM_ARTICULOS];
        for (int i = 0; i < NUM_ARTICULOS; i++) {
            int suma = 0;
            for (int j = 0; j < NUM_SUCURSALES; j++) {
                suma += cantidades[i][j];
            }
            totalPorArticulo[i] = suma;
        }

        // 2. Cantidad total de artículos en la sucursal 2 (índice 1)
        int totalSucursal2 = 0;
        for (int i = 0; i < NUM_ARTICULOS; i++) {
            totalSucursal2 += cantidades[i][1];
        }

        // 3. Cantidad del artículo 3 (índice 2) en sucursal 1 (índice 0)
        int cantidadArticulo3Sucursal1 = cantidades[2][0];

        // 4. Recaudación total por sucursal
        double[] recaudacionPorSucursal = new double[NUM_SUCURSALES];
        for (int j = 0; j < NUM_SUCURSALES; j++) {
            double suma = 0;
            for (int i = 0; i < NUM_ARTICULOS; i++) {
                suma += cantidades[i][j] * precios[i];
            }
            recaudacionPorSucursal[j] = suma;
        }

        // 5. Recaudación total de la empresa
        double recaudacionTotalEmpresa = 0;
        for (int j = 0; j < NUM_SUCURSALES; j++) {
            recaudacionTotalEmpresa += recaudacionPorSucursal[j];
        }

        // 6. Sucursal con mayor recaudación
        int sucursalMayorRecaudacion = 0;
        double mayorRecaudacion = recaudacionPorSucursal[0];
        for (int j = 1; j < NUM_SUCURSALES; j++) {
            if (recaudacionPorSucursal[j] > mayorRecaudacion) {
                mayorRecaudacion = recaudacionPorSucursal[j];
                sucursalMayorRecaudacion = j;
            }
        }

        // Mostrar resultados
        System.out.println("\nResultados:");

        // Cantidades totales de cada artículo
        System.out.println("1. Cantidades totales de cada artículo:");
        for (int i = 0; i < NUM_ARTICULOS; i++) {
            System.out.println("   Artículo " + (i + 1) + ": " + totalPorArticulo[i]);
        }

        System.out.println("2. Cantidad total de artículos en la sucursal 2: " + totalSucursal2);
        System.out.println("3. Cantidad del artículo 3 en la sucursal 1: " + cantidadArticulo3Sucursal1);

        System.out.println("4. Recaudación total de cada sucursal:");
        for (int j = 0; j < NUM_SUCURSALES; j++) {
            System.out.printf("   Sucursal %d: %.2f%n", (j + 1), recaudacionPorSucursal[j]);
        }

        System.out.printf("5. Recaudación total de la empresa: %.2f%n", recaudacionTotalEmpresa);
        System.out.println("6. Sucursal con mayor recaudación: Sucursal " + (sucursalMayorRecaudacion + 1));

        scanner.close();
    }
}
