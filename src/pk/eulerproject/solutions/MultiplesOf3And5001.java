package pk.eulerproject.solutions;

/**
 * Created by Exh on 2016-08-29.
 */
public class MultiplesOf3And5001 {

    public static int solution(int maxNumber){

        int sum = 0;
        for(int i = 0; i < maxNumber; i++){
            if(i % 3 == 0 || i % 5 == 0)
                sum += i;
        }

        return sum;
    }
}
