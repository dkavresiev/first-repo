package Selection01_Cycle;
import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        System.out.println("Guess the number from 0 to 9");
        int number = new Random().nextInt(10);
        //
        while (true) {
            int user = new Scanner(System.in).nextInt();
            if (user > number) {
                System.out.println("Number < your " + user + ". Try again");
            } else if (user < number) {
                System.out.println("Number > your " + user + ". Try again");
            } else {
                System.out.println("Congratulations its right. ");
                break;
            }
        }
    }
}









