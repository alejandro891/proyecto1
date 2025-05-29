public class Ejercicios2U12 {
    public static void main(String[] args) {
        int filas = 5;
        int columnas = 15;
        int[][] marco = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (i == 0 || i == filas - 1 || j == 0 || j == columnas - 1) {
                    marco[i][j] = 1;
                } else {
                    marco[i][j] = 0;
                }
            }
        }

        // Mostrar la matriz
        System.out.println("Matriz marco 5x15:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(marco[i][j] + " ");
            }
            System.out.println();
        }
    }
}
