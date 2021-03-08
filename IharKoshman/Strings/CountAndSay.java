package IharKoshman.Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The count-and-say sequence is a sequence of digit strings defined by the recursive formula:
 *
 * countAndSay(1) = "1"
 * countAndSay(n) is the way you would "say" the digit string from countAndSay(n-1),
 *      which is then converted into a different digit string.
 */

public class CountAndSay {
    public static void main(String[] args) {
        int n = 5;
        String res = countAndSay(n);
        System.out.println(res);
    }
    public static String countAndSay(int n) {
        if(n==1) {
            return "1";
        }
        String ans = "1";
        for(int i=2; i<=n; i++){
            ans = f(ans);
        }
        return ans;
    }

    public static String f(String s){
        char ch = s.charAt(0);
        int count = 1;
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<s.length(); ++i){
            if(s.charAt(i) != ch){
                sb.append(count).append(ch);
                ch = s.charAt(i);
                count = 1;
            } else {
                count++;
            }
        }
        sb.append(count).append(ch);
        return sb.toString();
    }
}
