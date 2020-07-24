package 별찍기12;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for(int i =1; i<=x; i++) {
			//top;
			for(int j=x; j>i; j--) {
				System.out.print(" ");
			}
			for(int k=0; k<i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<=x-1; i++) {
			for(int j =0; j<i; j++) {
				System.out.print(" ");
			}
			for(int k=x; k>i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
