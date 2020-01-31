package algorithms_1;

import java.util.ArrayList;

public class counter {
	public ArrayList<String> ones(ArrayList<String> list, int n){
		String orig = "";
		
		if (!list.isEmpty()) {
			orig = list.get(0);
		}
		
		if (n == 0) {
			return list;
		}
		else if(n == 1) {
			orig = orig + "1";
			list.set(0, orig);
			ones(list, (n-1));
		}
		else {
			orig = orig + "1+";
			list.set(0, orig);
			ones(list, (n-1));
		}
		return list;
	}
	
	public ArrayList<String> collapser(ArrayList<String> list){
		String ones = list.get(0);
		String addingtemp = "";
		int temp;
		
		for(int i=0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		while(ones.length() > 1) {
			addingtemp = ones.substring(0,3);
			
			System.out.println(addingtemp);
			
			temp = (Integer.parseInt(Character.toString(addingtemp.charAt(0)) + (Integer.parseInt(Character.toString(addingtemp.charAt(2))))));
			
			list.add(Integer.toString(temp));
			
			ones = ones.substring(4);
		}
		
		return list;
	}

}
