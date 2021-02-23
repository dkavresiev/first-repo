package Selection01_Cycle;

public class MultiplicationTableCase3 {
    public static void main(String[] args) {
        int to = 9;

        for (int i = 2; i <= to ; i++) {
            for (int j = 2; j <= to ; j++) {
                System.out.println(i + " * " + j + " = " + ( i *j ));
                if((i*j == 45)){
                    System.out.println();
                }
            }

        }
    }
}
