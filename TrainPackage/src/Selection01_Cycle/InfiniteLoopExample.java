package Selection01_Cycle;
import java.util.Scanner;
public class InfiniteLoopExample {
    public static void main(String[] args) {
        while( true){
            int num = new Scanner(System.in).nextInt();
            System.out.println(num * num);
        }
    }
}
