package 소인수분해;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int i = 2;
		while(N >= i) {
			if(N % i == 0) {
				System.out.println(i);
				N /= i;
			} else {
				i++;
			}
		}
	}
}