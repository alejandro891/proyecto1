import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Ingresar el sueldo de una persona, si supera los 3000 dolares mostrar un
        //mensaje en pantalla indicando que debe abonar impuestos.

        final int numLIMITE=3000;
        System.out.println("ingrese su sueldo");
        int numSueldo = scanner.nextInt();
        final int num_MONTO = numLIMITE;

        if (numSueldo>num_MONTO) {
            System.out.println("debe abonar impuestos");
            
        }

    }
}
