package Selection01_Cycle;

public class InfiniteOrLongCycle {
    public static void main(String[] args) {
        long time = System.nanoTime();

        for (int i = 0; i <= 1000000000; i++) {
            System.currentTimeMillis();
            if (i % 1000000 == 0){
                System.out.println(i);
            }
        }
        long result = System.nanoTime() - time;
        System.out.println((double) result / 1000000000 + " Seconds ");


    }
    }

