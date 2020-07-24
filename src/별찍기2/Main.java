package 별찍기2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for(int i=1; i<=x; i++) {
			for(int j=x-1; j>=i; j--) {
				System.out.print(" ");
			}
			for(int k=0; k<i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
