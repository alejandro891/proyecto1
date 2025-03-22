import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Se ingresa por teclado un número positivo de uno o dos dígitos (1..99)
        //mostrar un mensaje indicando si el número tiene uno o dos dígitos.
        //(Tener en cuenta que condición debe cumplirse para tener dos dígitos
        //un número entero)
        final int numLIMITE=99;
        final int numMINIMO_DOS_DIGITOS=10;
        final int numLIMITE_UN_DIGITO=9;
        System.out.println("ingrese un numero positivo de uno o dos digitos");
        int numEntero = scanner.nextInt();

        if (numEntero<=numLIMITE ) {

            if (numEntero>0) {
                if (numEntero<=numLIMITE_UN_DIGITO) {
                    System.out.println("el numero tiene un digito");
                } else { if (numEntero>= numMINIMO_DOS_DIGITOS) {
                    System.out.println("el numero tiene dos digitos");
                    
                }
                    
                }
            }   
        }
    }   
}
