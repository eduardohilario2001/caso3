package caso3;
import java.util.Scanner;
public class Caso4 {
    public static void main(String[] args) {
     Scanner x=new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
    int a=x.nextInt();
        System.out.println("Ingrese el segundo numero");
    int b=x.nextInt();
        if (a>b) {
            System.out.println("El menor numero es.." +b);
        } else 
            System.out.println("El menor numeros es.." +a);
    }
    
}
