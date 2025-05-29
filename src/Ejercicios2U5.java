import java.util.Arrays;
import java.util.Random;

public class Ejercicios2U5 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Random rand = new Random();

        // Inicializar con valores aleatorios entre 1 y 100
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(100) + 1;
        }

        // Mostrar vector original
        System.out.println("🔢 Vector original:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }

        // Ordenar el vector de menor a mayor
        Arrays.sort(numeros);

        // Mostrar vector ordenado
        System.out.println("\n\n⬆️ Vector ordenado de menor a mayor:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}
