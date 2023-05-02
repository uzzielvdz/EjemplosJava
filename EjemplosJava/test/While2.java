
import java.util.Scanner;


public class While2 {
   public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero entero del que quiere generar su tabla de multiplicación:\n");
        int n = leer.nextInt();
        
        int c = 0;
        while ( c <= 10){
            System.out.printf("%d  x %d = %d\n", n, c, (n*c));
        
        }  
}
}