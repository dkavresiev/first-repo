package Test;
import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
        System.out.println("Enter a");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Enter b");
        int b = new Scanner(System.in).nextInt();

        int aplus = a+ b;
        int aminus = a -b ;
        int abc = a*b;

        System.out.println(" a + b = " + aplus);
        System.out.println(" a - b = " + aminus);
    }
}
//WELL DONE !!!!