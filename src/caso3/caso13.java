package caso3;

import java.util.Scanner;

public class caso13 {
  public static void main(String[] args) {
     Scanner x=new Scanner(System.in);
     float resultado=0;
      System.out.println("Ingrese el primer numero: ");
   int a=x.nextInt();
      System.out.println("Ingrese el segundo numero: ");
   int b=x.nextInt();
      System.out.println("Operacion[1-6]: ");
   int c=x.nextInt();
   switch(c){
       case 1:
        resultado=a+b;
        System.out.println("Primer numero: " +a);
        System.out.println("Primer numero: " +b); 
        System.out.println("Operacion: Suma");
        System.out.println("Resultado: " +resultado);
        break;
        case 2:
        resultado=a-b;
        System.out.println("Primer numero: " +a);
           System.out.println("Primer numero: " +b); 
           System.out.println("Operacion: resta");
           System.out.println("Resultado: " +resultado);
        break;
        case 3:
        resultado=a*b;
        System.out.println("Primer numero: " +a);
           System.out.println("Primer numero: " +b); 
           System.out.println("Operacion: producto");
           System.out.println("Resultado: " +resultado);
        break;
        case 4:
            if (b>0) {
           resultado=a/b;
           System.out.println("Primer numero: " +a);
           System.out.println("Primer numero: " +b); 
           System.out.println("Operacion: Division");
           System.out.println("Resultado: " +resultado);
           break;
            } else {
           resultado=0;
           System.out.println("Primer numero: " +a);
           System.out.println("Primer numero: " +b); 
           System.out.println("Operacion: No es posible hallar la division");
           System.out.println("Resultado: " +resultado);
                break;
            }
        case 5:
        if (b>0) {
           resultado=a%b;
           System.out.println("Primer numero: " +a);
           System.out.println("Primer numero: " +b); 
           System.out.println("Operacion: residuo");
           System.out.println("Resultado: " +resultado);
           break;
            } else {
           resultado=0;
           System.out.println("Primer numero: " +a);
           System.out.println("Primer numero: " +b); 
           System.out.println("Operacion: No es posible hallar el residuo");
           System.out.println("Resultado: " +resultado);
                break;
            }
        case 6:
        resultado=(float)((a+b)/2);
        System.out.println("Primer numero: " +a);
           System.out.println("Primer numero: " +b); 
           System.out.println("Operacion: promedio");
           System.out.println("Resultado: " +resultado);
        break;
        default:
        resultado=0;
        break;  
   }
   
  }
}
