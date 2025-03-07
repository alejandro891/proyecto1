public class ContadorPares {
    public static void main(String[] args) {
        

        int ContadorPares= 0;

        for(int i=1;i<=100; i++){
            if (i % 2 == 0) {
            
                ContadorPares ++;
              
               
                
            }
    
        }

        System.out.println("hay " + ContadorPares + " numeros pares");
    }
} 
