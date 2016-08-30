package pk.eulerproject.solutions;

/**
 * Created by Exh on 2016-08-29.
 */
public class SpecialPythagoreanTriplet009 {

    public static int solution(){

        for(int i = 1; i <= 600; i++){
            for(int j = 1; j <= 600; j++){
                for(int k = 1; k <= 600; k++){
                    if(isPythagorean(i,j,k)&&isSum1000(i,j,k)){
                        System.out.println(i + " " + j + " " + k);
                        return i*j*k;
                    }

                }
            }
        }


        return 0;
    }

    public static boolean isPythagorean(int num1, int num2, int num3){
        double pow1 = Math.pow(num1, 2);
        double pow2 = Math.pow(num2, 2);
        double pow3 = Math.pow(num3, 2);
        if(pow1 + pow2 == pow3 || pow1 + pow3 == pow2 || pow2 + pow3 == pow1)
            return true;
        else
            return false;
    }
    public static boolean isSum1000(int num1, int num2, int num3){
        if (num1 + num2 + num3 == 1000)
            return true;
        else
            return false;
    }
}
