package Selection01_Cycle;

public class MultiplicationTableCase1 {
    public static void main(String[] args) {
     int to = 9;

        for (int i = 1; i <= to ; i++) {
            for (int j = 1; j <=  to ; j++) {
                int res;
                res = (i * j) ;
                System.out.print((res == 1 ? "" : res) + "\t");

            }
            System.out.println();
        }
    }
}
//Well done !!!!!!!