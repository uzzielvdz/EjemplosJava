import java.util.Scanner;
public class doWhile2 {
    
    static Scanner leer = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("Ingrese el numero del que se realizara la tabval de multiplicar:\n");
        int num = leer.nextInt();
        int i = 1;
        do {
            System.out.printf("%i x %i = %i\n ", num, i, i*num);
            i++;
        } while (i<10);
    }
}
