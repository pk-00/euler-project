package pk.eulerproject.solutions;

import java.util.ArrayList;

/**
 * Created by Exh on 2016-08-29.
 */
public class Prime10001st007 {

    public static int solution(int primeNo) {

        ArrayList<Integer> primes = new ArrayList<Integer>();

        for (int i = 2; i <= 10000000; i++){
            if(isPrime(i)) {
                primes.add(i);
            }
            if(primes.size()==primeNo) {
                System.out.println(primes.size());
                for (int j = 0; j < primes.size(); j++)
                    System.out.println(j + ". prime: " + primes.get(j));
                return primes.get(primeNo-1);
            }
        }

        return 0;
    }

    public static boolean isPrime(double number) {

        double sqNumber = Math.sqrt(number);

        if (number == 2)
            return true;
        else if (number % 2 == 0)
            return false;

        for(int i = 3; i <= sqNumber; i++) {
            if (number % i == 0)
                return false;
        }

        return true;

    }


}
