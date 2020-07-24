package LCM;

import java.util.Scanner;

public class Main {
	
	public static long gcd(long first, long second) {
		if(second==0) {
			return first;
		}else {
			return gcd(second, first%second);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x =sc.nextInt();
		long temp=0;
		while(x-->0) {
			long first = sc.nextInt();
			long second = sc.nextInt();
			temp = (first * second)/gcd(first,second);
			System.out.println(temp);
		}
		
		

	}

}
