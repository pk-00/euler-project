package pk.eulerproject.solutions;

/**
 * Created by Exh on 2016-08-29.
 */
public class SumSquareDifference006 {

    public static int solution(int maxNumber){

        int sum = 0;
        int sumOfPowers = 0;
        int powerOfSum = 0;

        for (int i = 1; i <= maxNumber; i++) {
            sum += i;
        }

        for (int i = 1; i <= maxNumber; i++){
            sumOfPowers += Math.pow(i, 2);
        }

        powerOfSum = (int)Math.pow(sum, 2);


        return powerOfSum - sumOfPowers;


    }

}
