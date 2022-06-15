package ca.ciccc.wmad.assignment2.question8;

public class Question8 {

    public static void test(){

        final int TRIES = 10000;

        int hits = 0;
        for(int i = 1; i<=TRIES;i++) {
            double r = Math.random();
            double x = -1 + (2 * r);
            r = Math.random();
            double y = -1 + (2 * r);

            if (x * x + y * y <= 1) {
                hits = hits + 1;
            }
            if(i == 100){
                double piEstimate = 4.0*hits/i;
                System.out.println("Estimate of PI for "+i+" tries is " +piEstimate);
            }
            if(i == 1000){
                double piEstimate = 4.0*hits/i;
                System.out.println("Estimate of PI for "+i+" tries is " +piEstimate);
            }
        } double piEstimate = 4.0*hits/TRIES;
        System.out.println("Estimate of PI for "+TRIES+" tries is " +piEstimate);
    }
}
