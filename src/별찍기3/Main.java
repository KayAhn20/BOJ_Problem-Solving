package 별찍기3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		while(x-->0) {
			for(int j =x; j>=0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
