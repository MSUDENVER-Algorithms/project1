package algorithms_1;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		int[] out = new int[100];
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("Enter number (n) you want to find the tree for:");
		n = sc.nextInt();
		
		while (n <= 0) {
			System.out.println("Invalid entry, please enter a valid n");
			n = sc.nextInt();
		}
		
		nxtLeaf(1, n, out, 0);
	}
	
	public static void nxtLeaf(int i, int n, int[] out, int newIndex){
		int j;
		
		if (n == 0) {
			for(int k=0; k < newIndex-1; k++) {
				System.out.print(out[k]);
				System.out.print(" + ");
				
			}
			System.out.print(out[newIndex-1] + "\n");
		}
		
		for (j=i; j <= n; j++) {
			out[newIndex] = j;
			nxtLeaf(j, n-j, out, newIndex+1);
		}
	}
}


