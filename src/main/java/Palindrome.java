
public class Palindrome {
    /**
     * Palindromes are words that are the same forwards as they are backwards - eg, 'bob', 'racecar'.
     *
     * You can solve this problem in several ways:
     * You could start with a String reversal algorithm, which you have already written, and check if str is the same
     * as its reversed form, or, you could check if the character at the nth position of a String moving forwards
     * re the same as the nth position of a String moving backwards.
     *
     * @param str A String.
     * @return true if str is a palindrome, false otherwise.
     */
    public boolean pal(String str){
        int mid = str.length()/2;
        int len = str.length()-1;
        for(int i = 0; i < mid; i++){
            if(str.charAt(i) != str.charAt(len-i) ){
                return false;
            }
        }
        return true;
    }
}
