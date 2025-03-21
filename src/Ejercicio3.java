import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Se ingresa por teclado un número positivo de uno o dos dígitos (1..99)
        //mostrar un mensaje indicando si el número tiene uno o dos dígitos.
        //(Tener en cuenta que condición debe cumplirse para tener dos dígitos
        //un número entero)
        System.out.println("ingrese un numero positivo de uno o dos digitos");
        int numEntero = scanner.nextInt();

        if (numEntero<=99 ) {

            if (numEntero>0) {
                if (numEntero<=9) {
                    System.out.println("el numero tiene un digito");
                } else { if (numEntero>=10) {
                    System.out.println("el numero tiene dos digitos");
                    
                }
                    
                }
            }   
        }
    }   
}
