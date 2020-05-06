package caso3;
import java.util.Scanner;
public class caso14 {
     public static void main(String[] args) {
     Scanner x=new Scanner(System.in);
    String nc;
    String nt;
     int monto = 0;
     float dsc = 0;
     float total;
     float dolar;
         System.out.println("Ingrese su nombre");
    String  a=x.next();
         System.out.println("Ingrese su carrera <ds/rc/dg>: ");
    String b=x.next();
         System.out.println("Ingrese su carrera <m/t/n>: ");
    String c=x.next();
    
    switch (b){   
        case "ds":
            nc="Desarrolo de sofware";
            monto=1500; 
            System.out.println(nc);
            System.out.println(monto);
            break;
        case "rc":
            nc="Redes y Conectividad";
            monto=1400;
            System.out.println(nc);
            System.out.println(monto);
            break;
        case "dg":
            nc="Diseño Gráfico";
            monto=1300;
            System.out.println(nc);
            System.out.println(monto);
            break;            
    }
    switch(c){
        case "m":
            nt="Turno Mañana";
            dsc=(float) (1500*0.1); 
            System.out.println(nt);
            System.out.println(dsc);
            break;
        case "t":
            nt="Turno Tarde";
            dsc=(float) (1400*0.2);
            System.out.println(nt);
            System.out.println(dsc);
            break;
        case "n":
            nt="Turno Noche";
            dsc=(float) (1300*0.15);
            System.out.println(nt);
            System.out.println(dsc);
            break;  
    }
    total=monto+dsc;
    dolar=(float) (total/3.33);
         System.out.println("El total en dolares a pagar es: " +dolar);
     }  
}
