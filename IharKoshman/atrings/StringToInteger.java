package IharKoshman.atrings;

/**
 * Implement the myAtoi(string s) function,
 *  which converts a string to a 32-bit signed integer (similar to C/C++'s atoi function).
 */

public class StringToInteger {
    public static void main(String[] args) {
        String str = "-91283472";
        int res = myAtoi(str);
        System.out.println(res);
    }
    public static int myAtoi(String s) {
        s = s.trim();
        if(s == null || s.length() == 0){
            return 0;
        }

        long result = 0;

        boolean isNegative = false;

        if(s.charAt(0) == '-'){
            isNegative = true;
        }
        else if(s.charAt(0) == '+'){
            isNegative = false;
        }
        else if(!Character.isDigit(s.charAt(0))){
            return 0;
        }

        else{
            result = Character.getNumericValue(s.charAt(0));
        }

        for(int i = 1 ; i<s.length() ; ++i){

            if(Character.isDigit(s.charAt(i))){
                result = result*10 + (Character.getNumericValue(s.charAt(i)));

                if(!isNegative && result>=Integer.MAX_VALUE){
                    return Integer.MAX_VALUE;
                }

                if(isNegative && result>=(long)Integer.MAX_VALUE+1){
                    return Integer.MIN_VALUE;
                }
            }
            else{
                break;
            }
        }

        if(!isNegative){
            return (int)result;
        }
        else{
            return -1*(int)result;
        }
    }
}
