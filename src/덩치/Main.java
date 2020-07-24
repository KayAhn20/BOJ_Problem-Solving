package 덩치;


// #7568 브루트포스 문제


import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int[][] arr = new int[x][2];
		int[] rank = new int[x];
		
		for(int i=0; i<x; i++) {
			for(int j=0; j<2; j++) {
				arr[i][j] = sc.nextInt();
				rank[i]=1;
			}
		}
		for(int i=0; i<x; i++) {
			for(int j=0; j<x; j++) {
				if(arr[i][0]>arr[j][0] && arr[i][1]>arr[j][1]) {
					rank[j]++;
				}
			}
		}
		for(int i =0; i<x; i++) {
			System.out.print(rank[i]+ " ");
		}
	}
}
