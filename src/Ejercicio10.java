import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        /*
De un operario se conoce su sueldo y los años de antigüedad. Se pide
confeccionar un programa que lea los datos de entrada e informe:
a) Si el sueldo es inferior a 500 y su antigüedad es igual o superior a 10 años, otorgarle un aumento del 20 %, mostrar el sueldo a pagar.
b)Si el sueldo es inferior a 500 pero su antigüedad es menor a 10 años, otorgarle un aumento de 5 %.
c) Si el sueldo es mayor o igual a 500 mostrar el sueldo en pantalla sin cambios.
*/
    final float numPORCENTAJE20= 0.2f;
    final float numPORCENTAJE5=0.05f;
    final int numSUELDO_MINIMO=500;
    final int numAÑOS_MINIMO=10;
    Scanner scanner = new Scanner(System.in);
    System.out.println("ingrese su sueldo");
    float numSueldo = scanner.nextFloat();
    System.out.println("ingrese sus años de antiguedad ");
    float numAños =  scanner.nextFloat();

    if ((numSueldo < numSUELDO_MINIMO) & (numAños>=numAÑOS_MINIMO)) {

        float numAumento = (numPORCENTAJE20 * numSueldo)+numSueldo;
        System.out.println("el total a pagar es: $"+numAumento);

        
    } else {

        if ((numSueldo<numSUELDO_MINIMO)&(numAños<numAÑOS_MINIMO)) {

            float numAumento = (numPORCENTAJE5 * numSueldo)+numSueldo ;
            System.out.println("el total a pagar es: $"+numAumento);
       
        
            
        } else {
            if (numSueldo>=numSUELDO_MINIMO) {
                System.out.println("el total a pagar es: $" + numSueldo);


                
            }
            
        }
        
    }

    }
    
}
