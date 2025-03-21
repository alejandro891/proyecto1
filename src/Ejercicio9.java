import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        /*
Confeccionar un programa que pida por teclado tres notas de un alumno,
calcule el promedio e imprima alguno de estos mensajes:
Si el promedio es >=7 mostrar "Promocionado".
Si el promedio es >=4 y <7 mostrar "Regular".
Si el promedio es <4 mostrar "Reprobado".
*/

    Scanner scanner =new Scanner(System.in);
    System.out.println("ingrese la primera nota del alumno");
    float numNota1 = scanner.nextFloat();
    System.out.println("ingrese la segunda nota del alumno");
    float numNota2 = scanner.nextFloat();
    System.out.println("ingrese la tercera nota del alumno");
    float numNota3 = scanner.nextFloat();

    float numPromedio = (numNota1+numNota2+numNota3)/3;

    if (numPromedio>=7) {
        System.out.println("promocionado");
        
    } else {
        if ((numPromedio>=4)& (numPromedio<7)) {
            System.out.println("regular");
            
        } else {
            System.out.println("reprobado");
            
        }
        
    }
    }
    
}
