package ca.ciccc.wmad.assignment2.question10;

public class Question10 {

    public static void testing(){
        double f1x = 0;
        double f2x = 0;
        int x = 3;
        while(f1x<=f2x){
            f1x = Math.pow(2,x);
            f2x = Math.pow(x,5);
            System.out.println("x="+x+"  f1x="+f1x+"  f2x="+f2x);
            x++;
        }

        System.out.println("x="+x+"  f1x="+f1x+" f2x="+f2x);
    }
}
