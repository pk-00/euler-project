package pk.eulerproject.solutions;

/**
 * Created by Exh on 2016-08-29.
 */
public class HighlyDivisibleTriangularNumber012 {

    public static long solution(){
        long number;
        int tmp = 0;
        while(true) {
            tmp++;
            number=triangleNum(tmp);
            int nOD = numberOfDivisors(number);
                System.out.println(number + " " + nOD);
            if(nOD > 500)
                return number;
        }
    }

    public static int numberOfDivisors(long number){


        int numOfDivisors = 0;
        double sqrtN = Math.sqrt(number);
        for(int i= 1; i <= sqrtN; i++) {
            if (number % i == 0) {
                numOfDivisors += 2;
            }
        }
            if (sqrtN * sqrtN == number) {
                numOfDivisors--;
            }

        return numOfDivisors;
    }

    public static long triangleNum(int tNumber){
        long triangle = (tNumber * (tNumber + 1)/2);
        return triangle;
    }
}
