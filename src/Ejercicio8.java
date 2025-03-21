import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
Un postulante a un empleo, realiza un test de capacitación, se obtuvo la siguiente información: cantidad total de preguntas que se le realizaron y la 
cantidad de preguntas que contestó correctamente. Se pide confeccionar un programa que ingrese los dos datos por teclado e informe el nivel del mismo 
según el porcentaje de respuestas correctas que ha obtenido, y sabiendo que:
	Nivel máximo:	Porcentaje>=90%.
	Nivel medio:	Porcentaje>=75% y <90%.
	Nivel regular:	Porcentaje>=50% y <75%.
	Fuera de nivel:	Porcentaje<50%.
*/
    System.out.println("ingrese la cangidad de preguntas que se hicieron");
    float numPreguntas = scanner.nextFloat();
    System.out.println("ingrese la cantidad de preguntas respondidas correctamente");
    float numRespuestas = scanner.nextFloat();

    float numPromedio = (numRespuestas/numPreguntas)*100;
    System.out.println("su nivel es: " + numPromedio);

    if (numPromedio>=90) {
        System.out.println("nivel maximo");
        
    } else {
        if ((numPromedio>=75) & (numPromedio<90) ) {
            System.out.println("nivel medio");

            
        } else {
            if ((numPromedio>=50) & (numPromedio<75)) {
                System.out.println("nivel regular");
                
            } else {
                if (numPromedio<50) {
                    System.out.println("fuera de nivel");

                    
                }
                
            }
            
        }
    }

    }
}
