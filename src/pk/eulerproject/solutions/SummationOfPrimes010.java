package pk.eulerproject.solutions;

/**
 * Created by Exh on 2016-08-29.
 */
public class SummationOfPrimes010 {

    public static long solution(int maxNumber){
        long sum = 0;
        for(int i = 1; i <= maxNumber; i++){
            if(isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }
    public static boolean isPrime(double number) {

        double sqNumber = Math.sqrt(number);


        if (number == 2)
            return true;
        else if (number % 2 == 0 || number == 1)
            return false;

        for(int i = 3; i <= sqNumber; i++) {
            if (number % i == 0)
                return false;
        }

        return true;

    }

}
