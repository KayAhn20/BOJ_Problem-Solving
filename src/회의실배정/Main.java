package 회의실배정;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int temp = 0;
		int[][] arr = new int[x][2];
		for(int i=0; i<x; i++) {
			for(int k = 0; k<2; k++) {
				arr[i][k] = sc.nextInt();
				
			}
			
		}
		
	}
}
