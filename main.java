package algorithms_1;

import java.util.ArrayList;

public class main {
	public static void main(String[] args) {
		counter c = new counter();
		ArrayList<String> list = new ArrayList<String>();
		
		
		list.add("");
		list = c.ones(list, 5);
		System.out.println(list.get(0));
	}

}
