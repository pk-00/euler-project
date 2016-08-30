package pk.eulerproject.solutions;

import java.util.ArrayList;

/**
 * Created by Exh on 2016-08-29.
 */
public class LargestPalindromeProduct004 {

    public static int solution(){

        ArrayList<Integer> products = new ArrayList<Integer>();

        int LargestPalindromeSoFar = 0;
        for (int i = 999; i > 99; i--){
            for(int j = 999; j > 99; j--){
                products.add(i*j);
            }
        }

        for(int number : products){
            if(isPalindrome(number) && number > LargestPalindromeSoFar)
                LargestPalindromeSoFar = number;
        }
        return LargestPalindromeSoFar;
    }

    public static boolean isPalindrome(int number){
        String numStr = String.valueOf(number);
        String reversedString = reverseStr(numStr);

        if(reversedString.equals(numStr)){
            return true;
        }
        else
            return false;

    }

    public static String reverseStr(String stringToReverse){

        String reversedStr = "";

        for(int i = stringToReverse.length() - 1; i >= 0 ; i--){
            reversedStr += stringToReverse.charAt(i);
        }
        return reversedStr;
    }
}
