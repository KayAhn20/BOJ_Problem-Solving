package 이항계수2;

import java.util.Scanner;

public class Main {
	private static int factorial(int x) {
		if(x ==1||x==0) {
			return 1;
		}else {
			return x * factorial(x-1);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int result = factorial(x)/(factorial(y)*factorial(x-y));
		System.out.println(result);
	}
}