package Selection01_Cycle;

public class ReversNumber {
    public static void main(String[] args) {
        int num = 12345678;
        int reverse = 0;
        //

        while (num != 0){
            reverse *=  10;
            reverse += num%10;
            num /= 10;

        }
        System.out.println(reverse);
    }

}
//Well Done !!!