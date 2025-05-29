import java.util.Random;

public class Ejercicios2U1{
    public static void main(String[] args) {
        int[] vector_numeros = new int[10];
        Random rand = new Random();

        // Inicialización con valores aleatorios del 1 al 10
        for (int i = 0; i < vector_numeros.length; i++) {
            vector_numeros[i] = rand.nextInt(10) + 1;
        }

        // Mostrar cada número con su cuadrado y su cubo
        System.out.println("Número\tCuadrado\tCubo");
        for (int i = 0; i < vector_numeros.length; i++) {
            int numero = vector_numeros[i];
            int cuadrado = numero * numero;
            int cubo = numero * numero * numero;

            System.out.println(numero + "\t" + cuadrado + "\t\t" + cubo);
        }
    }
}
