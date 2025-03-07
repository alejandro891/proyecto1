import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {
         //Crea un programa en Java que solicite al usuario tres números y determine si el primero es mayor que el 
        //segundo y menor que el tercero. El programa debe utilizar tanto operadores de comparación como operadores lógicos.

        
                Scanner scanner = new Scanner(System.in);
                System.out.println("ingresa tres mumeros");
                
                System.out.println(" ingresa el primer numero");
                int num1 = scanner.nextInt();

                System.out.println(" ingresa el segundo numero");
                int num2 = scanner.nextInt();
                
                System.out.println(" ingresa el tercer numero");
                int num3 = scanner.nextInt();

                boolean ifevalua = (num1 > num2) && (num1 < num3 );
                
                System.out.println(" el resultado es :" +ifevalua);

                scanner.close();


        
    }
}
