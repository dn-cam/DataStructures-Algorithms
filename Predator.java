
/**
 * 
 */
import java.util.*;

/**
 * @author camelliadebnath 20-Mar-2019
 */

//[ -1, 8, 8, 2, 7, 0, 5, 3, -1]

public class Predator {

	public static int levels(List<Integer> arr) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.size(); i++) {
			map.put(i, arr.get(i));
		}

		List<Integer>[] levs = new ArrayList[arr.size()];

		for (int k = 0; k < arr.size(); k++) {
			int count = 0;
			int key = k;
			while (map.get(key) != -1) {
				key = map.get(key);
				count++;
			}
			if (levs[count] == null)
				levs[count] = new ArrayList<Integer>();
			levs[count].add(k);
		}

		int levels = 0;
		for (int l = 0; l < levs.length; l++) {
			if (levs[l] != null) {
				levels++;
				for (int p = 0; p < levs[l].size(); p++)
					System.out.print(levs[l].get(p) + ", ");
			}
				
			System.out.println();

		}
		return levels;
	}

	// [ -1, 8, 8, 2, 7, 0, 5, 3, -1]
	public static void main(String args[]) {
		List<Integer> arr = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			arr.add(scan.nextInt());
		}
		int N = levels(arr);
		System.out.println("Number of predator levels: "+N);

	}

}
