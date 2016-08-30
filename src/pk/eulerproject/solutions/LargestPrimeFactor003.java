package pk.eulerproject.solutions;

/**
 * Created by Exh on 2016-08-29.
 * The prime factors of 13195 are 5, 7, 13 and 29.

 What is the largest prime factor of the number 600851475143 ?
 */
public class LargestPrimeFactor003 {

    public static long solution(long number){

        long num1 = 0;
        //int num2 = 0;

        for(int i = 2; i < number ; i++){
            if (number % i == 0)
                number /= i;

        }
        return number;
    }

}
