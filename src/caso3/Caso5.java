package caso3;
import java.util.Scanner;
public class Caso5 {
    public static void main(String[] args) {
     Scanner x=new Scanner(System.in);
     float total;
     float descuento;
     float neto;
     System.out.println("Ingrese el valor del productor");
    float a=x.nextFloat();
     System.out.println("Ingrese cantidad ");
    float b=x.nextFloat();
        if (b>8) {
     total=a*b;
     descuento=(float) (total*0.10);
     neto=total-descuento;
            System.out.println("El precio es..." +a);
            System.out.println("La cantidad es..." +b);
            System.out.println("El total es..." +total);
            System.out.println("El descuento es..." +descuento);
            System.out.println("El neto es..." +neto);
        } else {
     total=a*b;
     descuento=0;
     neto=total;
            System.out.println("El precio es..." +a);
            System.out.println("La cantidad es..." +b);
            System.out.println("El total es..." +total);
            System.out.println("El descuento es..." +descuento);
            System.out.println("El neto es..." +neto);     
            
        }
    }
    
}
