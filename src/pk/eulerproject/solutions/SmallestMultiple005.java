package pk.eulerproject.solutions;

/**
 * Created by Exh on 2016-08-29.
 */
public class SmallestMultiple005 {

   /* public static int solution(int maxNumber){
    }*/

    public static int solution(int maxNumber){

        for (int multipleNumber = 1; multipleNumber < 1000000000; multipleNumber++) {

            for (int i = 1; i <= maxNumber; i++) {
                if (multipleNumber % i != 0)
                    break;
                else if (i == 20)
                    return multipleNumber;
            }
        }
     return -1;
    }
}
