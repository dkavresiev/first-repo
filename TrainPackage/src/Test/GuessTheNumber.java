package Test;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        System.out.println("Guess the number ");
        int number = new Random().nextInt(10);

        while (true) {
            int user = new Scanner(System.in).nextInt();


            if (user > number) {
                System.out.println("Number < " + user + " Try again ");
            } else if (user < number) {
                System.out.println("Number > " + user + " Try again ");
            } else {
                System.out.println("You guess ");
                break;
            }

        }
    }
}