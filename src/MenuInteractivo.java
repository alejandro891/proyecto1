import java.util.Scanner;

public class MenuInteractivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // pedimos al usuario dos nuemros
        System.out.println("ingresa dos nuemros para hacer una operacion matematica");
        System.out.println("ingresa el primer numero");
        int num1 = scanner.nextInt();
        System.out.println("ingresa el segundo numero");
        int num2 = scanner.nextInt();

        //pedimos al usuario que operacion quiere hacer
        System.out.println("ingresa 1 para sumar");
        System.out.println("ingresa 2 para restar");
        System.out.println("ingresa 3 para multiplicar");
        System.out.println("ingresa 4 para division");
        int num = scanner.nextInt();
        
        // evaluamos la opcion dada por el usuario y hacemos las respectivas operaciones
        // suma
        if (num==1) { 
            int numSuma = num1+num2;
            System.out.println("la suma es: " + numSuma);
            
        } else {
            //resta
            if (num==2) {
                int numResta = num1-num2;
                System.out.println("la resta es: " + numResta);
                
            } else {
                //multiplicacion
                if (num==3) {
                    int numMultiplicacion = num1*num2;
                    System.out.println("la multiplicacion es: " + numMultiplicacion);
                    
                } else {
                    //division
                    if (num==4) {
                        int numDivision = num1 / num2;
                        System.out.println("la division es: " + numDivision);
                        
                    } else { 
                        System.out.println("opcion incorrecta");
                        
                    }
                }
                
            }
            
        }
    }
    
}
