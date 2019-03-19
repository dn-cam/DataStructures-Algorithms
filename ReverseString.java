/**
 * 
 */

/**
 * @author camelliadebnath
 * 19-Mar-2019
 */
public class ReverseString {
	    public void reverseString(char[] s) {
	        int n = s.length;
	        for(int i = 0; i < Math.floor(n/2); i++){
	                char temp = s[i];
	                s[i] = s[n - i - 1];
	                s[n - i - 1] = temp;
	            }
	        }
}
