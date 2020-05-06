package caso3;
import java.util.Scanner;
public class Caso3 {
    public static void main(String[] args) {
    Scanner x=new Scanner(System.in);
        System.out.println("Primer numero");
    int a=x.nextInt();
        System.out.println("Primer numero");
    int b=x.nextInt();
    
        if (a==b) {
            System.out.println("Los numeros son iguales");
            
        } else {
            if(a>b)
                System.out.println("el primer numero es mayor");
            else
                System.out.println("El primer numero es menor");
                        
            
        }
    
    }
    
}
