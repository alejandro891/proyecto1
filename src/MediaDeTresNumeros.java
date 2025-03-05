import java.util.Scanner;

public class MediaDeTresNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //pedimos al usuario que ingrese tres numeros
        System.out.println("ingresa tres numeros para sacarles la media");
        // primer numero
        System.out.println("ingresa el primer numero:");
        double num1 = scanner.nextDouble();
        // segundo numero
        System.out.println("ingresa el segundo numero:");
        double num2 = scanner.nextDouble();
        // tercer numero
        System.out.println("ingresa el tercer numero:");
        double num3 = scanner.nextDouble();
        // mostramos los tres numeros ingresados
        System.out.println("su primer numero es:"+ num1  +  " su segundo numero es:"+ num2  +  " y su tercer numero es:"+ num3 );
        // calculamos la media de los tres nuemros
        double media1 = (num1+num2+num3);
        double media = media1/3;
        // mostramos al usuario la media de los tres numeros
        System.out.println("la media de los tres numeros es:" +media);



    }
}