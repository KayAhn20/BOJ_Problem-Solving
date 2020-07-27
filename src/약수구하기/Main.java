package 약수구하기;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		ArrayList<Integer> arrlist = new ArrayList<>();
		for(int i=1; i<=x; i++) {
			if(x%i==0) {
				arrlist.add(i);
			}
		}
		int size = arrlist.size();
		if(size<y) {
			System.out.println(0);
		}else {
			int result = arrlist.get(y-1);
			System.out.println(result);
		}
		
	}
}
