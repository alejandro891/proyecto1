import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
Escribir un programa que solicite ingresar 10 notas de alumnos y nos informe
cuántos tienen notas mayores o iguales a 7 y cuántos menores.
*/
float notasAltas=0;
float notasBajas=0;
for (int i = 1; i <=10; i++) {
    System.out.println("ingrese nota del " + i +" estudiante");
    int notas = scanner.nextInt();
    
  if (notas >=7) {
    notasAltas++;
    
  } else {
    notasBajas++;
    
  }

}
 System.out.println(notasAltas);
 System.out.println(notasBajas);
    }
    
}
