import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Confeccionar un programa que permita cargar un número entero positivo
        //de hasta tres cifras y muestre un mensaje indicando si tiene 1, 2, o 3 cifras.
        //Mostrar un mensaje de error si el número de cifras es mayor.

        final int numLIMITE_UN_DIGITO=10;
        final int numMINIMO_DOS_DIGITOS=100;
        final int numLIMITE_TRES_DIGITOS=1000;
        System.out.println("ingrese un numero");
        int numEntero = scanner.nextInt();

        if (numEntero>0) {
                if (numEntero<numLIMITE_UN_DIGITO) {
                    System.out.println("el numero tiene un digito");
                } else {
                    if (numEntero<numMINIMO_DOS_DIGITOS) {
                        System.out.println("el numero tiene dos digitos");    
                    } else {
                        if (numEntero<numLIMITE_TRES_DIGITOS) {
                            System.out.println("el numero tiene tres digitos");
                        } else {
                            System.out.println("error");
                    }
                        
                }   
            }
        }
    }
}
