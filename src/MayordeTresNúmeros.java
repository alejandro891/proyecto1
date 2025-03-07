import java.util.Scanner;

public class MayordeTresNúmeros {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // pido al ususario tres numeros
        System.out.println("ingresa el primer numero");
        int num1 = scanner.nextInt();
        System.out.println("ingresa el segundo numero");
        int num2 = scanner.nextInt();
        System.out.println("ingresa el tercer numero");
        int num3 = scanner.nextInt();

        if (num1>num2 && num1>num3) { System.out.println("el numero mayor es el primero que es: " + num1);
            
        } else {
            if (num2>num1 && num2>num3) { System.out.println("el numero mayores el primero que es:" + num2);
                
            } else { System.out.println("el nuemro mayor es el primero que es: " + num3);
                
            }
            
        }

        




    }
}
