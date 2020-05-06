package caso3;
import java.util.Scanner;
public class Caso9 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
    float promedio;
    float asistencia;
    float n1;
    float n2;
        System.out.println("Ingrese primera nota");
    int a=x.nextInt();
        System.out.println("Ingrese segunda nota");
    int b=x.nextInt();
        System.out.println("Ingrese cantidad de asistencia");
    int c=x.nextInt();
        System.out.println("Ingrese nombre de alumno");
    String d=x.next();
    n1=(float) (a*0.30);
    n2= (float) (b*0.70);
    promedio=n1+n2;
    asistencia=((c*100)/12); 
        if (promedio>=13 && asistencia>=70){
            System.out.println("el alumno...." +d);
            System.out.println("el promedio...." +promedio);
            System.out.println("el asistencia...." +asistencia);
            System.out.println("el estado:Aprobado");         
        }else{
         System.out.println("el alumno...." +d);
         System.out.println("el promedio...." +promedio);
         System.out.println("el asistencia...." +asistencia);
         System.out.println("el estado:Desaprobado");         
        }
    }   
}
