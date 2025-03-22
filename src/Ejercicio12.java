import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        /*
En una empresa trabajan n empleados cuyos sueldos oscilan entre $100 y $500,
realizar un programa que lea los sueldos que cobra cada empleado e informe
cuántos empleados cobran entre $100 y $300 y cuántos cobran más de $300.
Además el programa deberá informar el importe que gasta la empresa en sueldos
al personal.
*/
Scanner scanner = new Scanner(System.in);
System.out.println("ingrese el numero de empleados");
int numEmpleados= scanner.nextInt();

int numCobro100_300 = 0;
int numCobroMas300 =0;
int numTotalPagos =0;
for (int i = 1; i <= numEmpleados; i++) {
    System.out.println("ingrese el sueldo del empleado  " + i );
    int numSueldo = scanner.nextInt();
    numTotalPagos+=numSueldo;

    if ((numSueldo>=100)&(numSueldo<=300)) {
        numCobro100_300 ++;
        
        
    }else{
        if (numSueldo>300) {
            numCobroMas300 ++;
            
        }
    }
}
    System.out.println("los que cobran entre 100 y 300 son: " + numCobro100_300);
    System.out.println("los que cobran mas e 300 son: " +numCobroMas300);
    System.out.println("el total de los pagos es: " +numTotalPagos);
    }
}
