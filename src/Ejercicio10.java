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
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("ingrese su sueldo");
    float numSueldo = scanner.nextFloat();
    System.out.println("ingrese sus años de antiguedad ");
    float numAños =  scanner.nextFloat();

    if ((numSueldo < 500) & (numAños>=10)) {

        float numAumento = (0.2f * numSueldo)+numSueldo;
        System.out.println("el total a pagar es: $"+numAumento);

        
    } else {

        if ((numSueldo<500)&(numAños<10)) {

            float numAumento = (0.05f * numSueldo)+numSueldo ;
            System.out.println("el total a pagar es: $"+numAumento);
       
        
            
        } else {
            if (numSueldo>=500) {
                System.out.println("el total a pagar es: $" + numSueldo);


                
            }
            
        }
        
    }

    }
    
}
