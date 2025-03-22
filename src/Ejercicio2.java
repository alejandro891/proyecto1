import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Se ingresan tres notas de un alumno, si el promedio es mayor o igual a siete
        //mostrar un mensaje "Promocionado".
        final int numPROMEDIO_MINIMO=7;
        final int numNOTAS=3;

        System.out.println("ingresa las tres notas del alumno");

        System.out.println("ingresa la primera nota ");
        float numNota1 = scanner.nextFloat();
        System.out.println("ingresa la segunda nota ");
        float numNota2 = scanner.nextFloat();
        System.out.println("ingresa la tercera nota ");
        float numNota3 = scanner.nextFloat();

        float numPromedio = (numNota1+numNota2+numNota3)/numNOTAS;
        

        if (numPromedio >= numPROMEDIO_MINIMO) {

            System.out.println("promocionado");
            
        } else {
            System.out.println("no promocionado ");
            
        }



    }
}
