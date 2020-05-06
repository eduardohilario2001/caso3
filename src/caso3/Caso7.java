package caso3;
import java.util.Scanner;
public class Caso7 {
    public static void main(String[] args) {
   Scanner x=new Scanner(System.in);
   int impuesto;   
        System.out.println("Ingrese sueldo");
    float a=x.nextFloat();
        if (a<=1500) {
        impuesto=(int) (a*0.03);
            System.out.println("El sueldo es..." +a);
            System.out.println("El impuesto es..." +impuesto);
        }if (a<=3000 && a>1500) {
        impuesto=(int) (a*0.08);
            System.out.println("El sueldo es..." +a);
            System.out.println("El impuesto es..." +impuesto);       
            }if (a>3000) {
        impuesto=(int) (a*0.12);
            System.out.println("El sueldo es..." +a);
            System.out.println("El impuesto es..." +impuesto);          
            }     
         }
    }
   
