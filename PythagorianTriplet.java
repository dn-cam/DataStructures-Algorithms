package report.java.ui;

import java.util.HashMap;

public class PythagorianTriplet {

	public boolean isSumOfSquares(int n){
		
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();

        for (int i = 0; i * i <= n; i++) { 
            hmap.put(i*i, 1);
            if (hmap.containsKey(n - i*i))
            	return true; 
            } 
return false; 
} 
	
	public static void main(String args[]) {
		
		PythagorianTriplet py = new PythagorianTriplet();
		System.out.println("25 is "+py.isSumOfSquares(25));
		System.out.println("12 is" + py.isSumOfSquares(12));
		System.out.println((int)Math.sqrt(25));
	}
}
