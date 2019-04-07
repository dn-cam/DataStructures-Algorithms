/**
 * 
 */
package husky.neu.edu;

import java.util.*;

/**
 * @author camelliadebnath 04-Apr-2019
 */

class DLL {
	String site;
	DLL prev;
	DLL next;

	DLL(String site) {
		this.site = site;
		this.prev = null;
		this.next = null;
	}
}

public class Cache {
	static DLL cacheHead = new DLL("");;
	static Map<String, DLL> map = new HashMap<String, DLL>();;
	static int CACHE_SIZE;
	static int counter = 1;

	public Cache(int n) {
		CACHE_SIZE = n;
	}

	/**
	 * checks if thiis site exists in the hashmap if it exists, then just display
	 * it, and put it at the head of the DLL if it doesn't, add it to the hashmap,
	 * and put it at the head of the DLL
	 */
	public String access(String sitename) {
		if (Cache.map.containsKey(sitename)) {
			if (Cache.cacheHead.site != sitename) {
				DLL temp = Cache.cacheHead;
				DLL site = Cache.map.get(sitename);
				site.next = Cache.cacheHead;
				Cache.cacheHead.prev = site;
				Cache.cacheHead = temp;
				temp.prev = null;
			}
		} else {
			if(Cache.counter < Cache.CACHE_SIZE) {
				
			}
		}
		return Cache.cacheHead.site;
	}


	public void printCache(){
		for(int i = 0; i< Cache.CACHE_SIZE; i++){
			System.out.println(Cache.cacheHead.site);
			cacheHead = cacheHead.next;
		}
		return "result";
	}


	public static void main(){
		Cache cache = new Cache("");
		cache.access("duckduckgo.com");
		cache.access("medium.com");
		cache.access("github.com");
	}

}














