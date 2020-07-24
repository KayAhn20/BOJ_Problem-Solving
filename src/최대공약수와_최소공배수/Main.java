package 최대공약수와_최소공배수;

import java.util.Scanner;

public class Main {
	public static int gcd(int x, int y) {
		if(y==0) {
			return x;
		}else {
			return gcd(y,x%y);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println(gcd(x,y));
		System.out.println((x*y)/gcd(x,y));
	}
}
