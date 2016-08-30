package pk.eulerproject.solutions;

/**
 * Created by Exh on 2016-08-29.
 */
public class EvenFibonacciNumbers002 {

    public static int solution(int maxNumber){

        int fib0 = 0;
        int fib1 = 1;
        int fibSum = 0;

        int sum = 0;

        while(fibSum < maxNumber){
            if(fibSum % 2 == 0)
                sum += fibSum;

            fibSum = fib0 + fib1;
            fib0 = fib1;
            fib1 = fibSum;
        }

        return sum;

    }

}
