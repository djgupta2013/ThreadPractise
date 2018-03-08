package failFastFailSafe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFast {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(20);
		list.add(30);
		list.add(40);
		
		Iterator<Integer> iterator=list.iterator();
		while(iterator.hasNext()) {
			Integer integer=iterator.next();
			System.out.println(integer);
			list.add(5);
		}

	}

}
