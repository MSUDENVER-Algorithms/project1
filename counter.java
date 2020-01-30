package algorithms_1;

import java.util.ArrayList;

public class counter {
	public ArrayList<String> ones(ArrayList<String> a, int n){
		String orig = "";
		
		if (!a.isEmpty()) {
			orig = a.get(0);
		}
		
		if (n == 0) {
			return a;
		}
		else if(n == 1) {
			orig = orig + "1";
			a.set(0, orig);
			ones(a, (n-1));
		}
		else {
			orig = orig + "1+";
			a.set(0, orig);
			ones(a, (n-1));
		}
		return a;
	}

}
