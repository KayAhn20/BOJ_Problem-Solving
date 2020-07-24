package 이항계수1;

import java.util.Scanner;

public class Main {
	private static int factorial(int x) {
		if (x == 1 || x ==0) {
			return 1;
		} else {
			return x * factorial(x - 1);
		}
	}

	private static int nPr(int x, int y) {
		int temp = 0;
		temp = factorial(x) / factorial(x - y);
		return temp;
	}

	private static int nCr(int x, int y) {
		int temp = 0;
		temp = nPr(x, y) / factorial(y);
		return temp;
	}

	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();

		System.out.println(nCr(x, y));

	}
}
