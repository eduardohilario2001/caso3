package caso3;
import java.util.Scanner;
//Desarrollado por Jesus Hilario
public class Caso6 {
    public static void main(String[] args) {
    Scanner x=new Scanner(System.in);
    float impuesto;    
    System.out.println("Ingrese sueldo");
    float a=x.nextFloat();
        if (a>2800) {
    impuesto=(float) (a*0.05);
        System.out.println("EL sueldo es..." +a);
        System.out.println("El impuesto es..."+impuesto);  
        } else {
    impuesto=(float) (a*0.02);
        System.out.println("EL sueldo es..." +a);
        System.out.println("El impuesto es..."+impuesto);    
        }
    }
    
}
