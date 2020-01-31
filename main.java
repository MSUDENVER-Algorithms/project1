package algorithms_1;

import java.util.ArrayList;

public class main {
	public static void main(String[] args) {
		counter c = new counter();
		ArrayList<String> list = new ArrayList<String>();
		
		
		list.add("");
		list = c.ones(list, 10);
		list = c.collapser(list);
		
		for(int i=0; i < list.size(); i++) {
			System.out.println("Item " + i + ":");
			System.out.println(list.get(i));
		}
	}

}
