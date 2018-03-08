package failFastFailSafe;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafe {

	public static void main(String[] args) {
		ConcurrentHashMap<Integer,String> map=new ConcurrentHashMap<Integer,String>();
		map.put(5, "ABC");
		map.put(10, "Deepak");
		map.put(15, "Ansh");
		Iterator<Integer> it = map.keySet().iterator();
		
		while(it.hasNext()) {
			Integer key=it.next();
			System.out.println(key+" "+map.get(key));
			map.put(50, "abcd");
		}
		System.out.println("Fail-safe");

	}

}
