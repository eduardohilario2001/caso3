package caso3;
import java.util.Scanner;
public class Caso1 {
public static void main(String[] args) {
     Scanner x=new Scanner(System.in);
    System.out.println("Ingrese edad");
    int a=x.nextInt();
    
    if(a>=18)
        System.out.println("Mayor de edad");
    else
        System.out.println("Menor de edad");
    }
    
}
