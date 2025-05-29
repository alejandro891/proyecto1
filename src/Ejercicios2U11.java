public class Ejercicios2U11 {
    public static void main(String[] args) {
        int[][] diagonal = new int[5][5];

        // Rellenar la matriz: 1 en diagonal principal, 0 en el resto
        for (int i = 0; i < diagonal.length; i++) {
            for (int j = 0; j < diagonal[i].length; j++) {
                if (i == j) {
                    diagonal[i][j] = 1;
                } else {
                    diagonal[i][j] = 0;
                }
            }
        }

        // Mostrar la matriz por pantalla
        System.out.println("Matriz diagonal 5x5:");
        for (int i = 0; i < diagonal.length; i++) {
            for (int j = 0; j < diagonal[i].length; j++) {
                System.out.print(diagonal[i][j] + " ");
            }
            System.out.println();
        }
    }
}
