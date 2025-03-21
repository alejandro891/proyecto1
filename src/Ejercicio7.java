import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Confeccionar un programa que permita cargar un número entero positivo
        //de hasta tres cifras y muestre un mensaje indicando si tiene 1, 2, o 3 cifras.
        //Mostrar un mensaje de error si el número de cifras es mayor.

        System.out.println("ingrese un numero");
        int numEntero = scanner.nextInt();

        if (numEntero>0) {
                if (numEntero<10) {
                    System.out.println("el numero tiene un digito");
                } else {
                    if (numEntero<100) {
                        System.out.println("el numero tiene dos digitos");    
                    } else {
                        if (numEntero<1000) {
                            System.out.println("el numero tiene tres digitos");
                        } else {
                            System.out.println("error");
                    }
                        
                }   
            }
        }
    }
}
