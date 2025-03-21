import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
    //Realizar un programa que solicite la carga por teclado de dos números,
    //si el primero es mayor al segundo informar su suma y diferencia,
    //en caso contrario informar el producto y la división
    //del primero respecto al segundo.
    Scanner scanner = new Scanner(System.in);
    System.out.println("ingrese el primer numero");
    float num1 = scanner.nextFloat();
    System.out.println("ingrese el segundo numero");
    float num2 = scanner.nextFloat();

    if (num1 > num2) {

        float numSuma = num1 + num2;
        float numResta = num1 - num2;

        System.out.println("como el numero 1 es mayor al numero 2 hacemos la suma y la resta de los dos numeros"  );
        System.out.println("la suma es  " + numSuma);
        System.out.println("la resta es  " +numResta);

        
    } else {
        float numProducto = num1 * num2;
        float numDivision = num1 / num2;
        System.out.println("como el numero 1 es menor al numero 2 hacemos el producto y la division de los dos numeros");
        System.out.println("el producto de los numeros " + numProducto );
        System.out.println("la division es " + numDivision);

    }
    }
}
