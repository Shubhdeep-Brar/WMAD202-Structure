package ca.ciccc.wmad.assignment7.Question5;

import java.util.List;
import java.util.function.Predicate;

public class RelativePrimeCheck <T> {
    public interface UnaryPredicate <T> extends Predicate<T> {}

    public static <T> int findFirst(List<T> list, int begin, int end, UnaryPredicate <T> p) {
        for (int i = begin; i <= end; i++) {
            for (int j = i + 1; j <= end; j++) {
                if (p.test(gcd(list.get(i), list.get(j)))) {
                    return (int) list.get(i);
                }
            }
        }
        return -1;
    }

    public static <T> T gcd(T a, T b){
        if((Integer) b == 0){
            return (T) a;
        }
        return (T) gcd(b,(Integer) a % (Integer) b);
    }

}
