package 별찍기8;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for(int i =1; i<=x; i++) {  // input = 10 ; then  9 lines;
			//top line;
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			for(int k=x-i; k>0; k--) {
				System.out.print(" ");
			}
			for(int k=x-i; k>0; k--) {
				System.out.print(" ");
			}
			for(int j =1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<x; i++) {
			for(int j=x-1; j>=i; j--) {
				System.out.print("*");
			}
			for(int k =0; k<i; k++) {
				System.out.print(" ");
			}
			for(int k=0; k<i; k++) {
				System.out.print(" ");
			}
			for(int j=x-1; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
