package Find_Max_2562;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = -100000;
		int index = 0;
		int[] ar= new int[9];
		for(int i=0; i<ar.length; i++) {
			ar[i] = sc.nextInt();
			if(ar[i]>max) {
				max = ar[i];
				index = i+1;
			}
		}
		System.out.println(max);
		System.out.println(index);
	}
}
