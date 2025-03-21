import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Se ingresa por teclado un valor entero,
        //mostrar una leyenda que indique si el número es positivo,
        //negativo o nulo (es decir cero)
        System.out.println("ingrese un numero");
        int numEntero = scanner.nextInt();
        if (numEntero>0) {
            System.out.println("el numero es positivo");
        } else {
            if (numEntero<0) {
                System.out.println("el numero es negatico");
            } else {
                System.out.println("el numeroe es nulo");
            }
        }

    }
}
