package caso3;
import java.util.Scanner;
public class Caso8 {
    public static void main(String[] args) {
   Scanner x=new Scanner(System.in);
   int nota;    
        System.out.println("Primer nota");
    int a=x.nextInt();
        System.out.println("segunda nota");
    int b=x.nextInt();
        System.out.println("tercera nota");
    int c=x.nextInt();
    nota=((a+b+c)/3);
        if (nota<=7) {
            System.out.println("sin palabras");
        }if (nota>=8 && nota<=10){
            System.out.println("Malo"); 
        }if (nota>=11 && nota<=14) {
          System.out.println("Regular");  
        }if (nota>=15 && nota<=17) {
          System.out.println("Notable");
        }if (nota>=18 && nota<=20) {
          System.out.println("Excelente");
        }
    }
} 
