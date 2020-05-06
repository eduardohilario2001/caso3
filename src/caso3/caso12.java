package caso3;

import java.util.Scanner;

public class caso12 {
    public static void main(String[] args) {
     Scanner x=new Scanner(System.in);
        System.out.println("Nombre de empleado: ");
    String empleado=x.nextLine();
        System.out.println("Nivel [1-4]: ");
    int nivel=x.nextInt();
        System.out.println("Sueldo: ");
    float sueldo=x.nextFloat();
    
    float inc=0;
    float nuevo=0;
    switch(nivel){
        case 1:
            inc=0.045f;
            break;
        case 2:
            inc=0.06f;
            break;
        case 3:
            inc=0.085f;
            break;    
        case 4:
            inc=0.11f;
            break;
        default:
            inc=0;
    }
    nuevo=sueldo*inc+sueldo;
        System.out.println("Empleado: " +empleado);
        System.out.println("nivel: " +nivel);
        System.out.println("sueldo: " +sueldo);
        System.out.println("Incremento: " +inc);
        System.out.println("Nuevo sueldo: " +nuevo);
}
}
