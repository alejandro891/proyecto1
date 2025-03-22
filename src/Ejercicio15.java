import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        //Utiliza el método: compareToIgnoreCase()
        //Realizar la carga de dos nombres de personas distintos.
        //Mostrar por pantalla luego ordenados en forma alfabética.
        Scanner scanner =new Scanner(System.in);
        System.out.println("ingrese el primer nombre");
        String strNombre1 = scanner.next();
        System.out.println("ingrese el segundo nombre");
        String strNombre2 = scanner.next();

        if (strNombre1.compareToIgnoreCase(strNombre2)<0) {
            System.out.println("el orden es:");
            System.out.println(strNombre1);
            System.out.println(strNombre2);
            
        } else {
            if (strNombre1.compareToIgnoreCase(strNombre2)>0) {
                System.out.println("el orden es:");
                System.out.println(strNombre2);
                System.out.println(strNombre1);
                
            }
            
        }

        

    }
}
