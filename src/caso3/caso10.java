package caso3;

import java.util.Scanner;

public class caso10 {
     public static void main(String[] args) {
     Scanner x=new Scanner(System.in);
    float importe,bono,descuento,meta;
         System.out.println("Ingrese su nombre: ");
    String a=x.nextLine();
         System.out.println("Ingrese su horas trabajadas: ");
   int b=x.nextInt();
         System.out.println("Ingrese tarifa por hora: ");
   int c=x.nextInt();
         System.out.println("Ingrese su minutos de tardanza: ");
   int d=x.nextInt();
   importe=b*c;
         if (b>60) {
     bono=(float) (importe*0.13);
         } else {
     bono=(float) (importe*0.04);
         }
         if (d>15) {
       descuento=(float) (importe*0.03);
         } else {
       descuento=0;
         }
         meta=((b*100)/70);
         System.out.println("Trabajador: " +a);
         System.out.println("Horas trabajadas: " +b);
         System.out.println("Tarifas por horas: " +c);
         System.out.println("Importe: " +importe);
         System.out.println("Bono: " +bono);
         System.out.println("Descuento: " +descuento);
         System.out.println("Meta alcanzada: " +meta);
}
}
