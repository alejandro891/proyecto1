import java.util.Scanner;

public class NumerosAmigos {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("ingrese el numero del inicio");
        int inicio=input.nextInt();
        System.out.println("ingrese el numero fin");
        int fin = input.nextInt();
        if (inicio > fin) {
            System.out.println("entrada no valida");
            input.close();
            return;
        }
        boolean encontrado = false;
        for (int i = Math.max(2,inicio); i < fin; i++) {
            int numContadorDivisores = 0;
            int numPrimerDivisor = 0;
            int numSegundoDivisor = 0;

            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {

                    numContadorDivisores ++;
                    
                    if (numContadorDivisores == 1) {
                        numPrimerDivisor = j;   
                    }
                    else if ( numContadorDivisores == 2){
                        numSegundoDivisor = j;
                    }
                    else {
                        break;
                    }
                    
                }
                
            }
        if (numContadorDivisores == 2) {
            encontrado= true;
            System.out.println(i + " es un numero amigo" + numPrimerDivisor + numSegundoDivisor);
            
        }
       }
       if (!encontrado) {
        System.out.println("no se encontraron numeros amigos");
        
       }
       input.close();
       
    }
}
