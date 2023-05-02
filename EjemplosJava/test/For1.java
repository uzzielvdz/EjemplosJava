import java.util.Scanner;

public class For1 {
    
    static Scanner leer = new Scanner(System.in);
    
    public void Tablas() {
        
    System.out.println("Este programa realiza las tablas de multiplicar de cualquier numero.\n");
    System.out.println("Ingrese el numero del que desea realizar la tabla de multiplicar:\n");
    int num = leer.nextInt();
        
    for (int i = 0; i<11; i++){
            System.out.printf("%i x %i = %i \n", num, i, num*i );
    }
    
   }
    
    public static void main(String[] args) {
        For1 TablasDeMultiplicar = new For1();
        TablasDeMultiplicar.Tablas();
    }
}
