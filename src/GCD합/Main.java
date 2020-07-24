package GCD합;

import java.util.*;

public class Main {
	public static int gcd(int x, int y) {
		if(y==0) {
			return x;
		}else {
			return gcd(y, x%y);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int NumofTest = sc.nextInt();
		while(NumofTest-->0) {
			int numbers = sc.nextInt();
			int[] array = new int[numbers];
			for(int i=0; i<numbers; i++) {
				array[i]=sc.nextInt();
			}
			long answer = 0;
			for(int i=0;i<numbers-1;i++) {
				for(int j=i+1; j<numbers; j++) {
					answer +=gcd(array[i], array[j]);
				}
			}
			System.out.println(answer);
		}
	}
}
