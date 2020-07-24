package 행렬곱셈;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int row1 = sc.nextInt();
		int col1 = sc.nextInt();
		int[][] arr = new int[row1][col1];
		for(int i =0 ; i<row1; i++) {
			for(int j=0; j<col1; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int row2 = sc.nextInt();
		int col2 = sc.nextInt();
		int[][] arr2 = new int[row2][col2];
		for(int k = 0; k<row2; k++) {
			for(int l = 0; l<col2; l++) {
				arr2[k][l] = sc.nextInt();
			}
		}
		
		for	(int i = 0; i<row1; i++) {
			for(int j = 0; j<col2; j++) {
				int total=0;
				for(int k=0; k<col1; k++) {
					total += arr[i][k] * arr2[k][j];
				}
				System.out.print(total + " ");
			}
			System.out.println();
		}
		
	}
}




/// 내가 시도하려던 코드  
/*

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x =sc.nextInt();
		int y = sc.nextInt();
		int[][] arr1 = new int[x][y];
		for(int i=0;i<x;i++) {
			for(int j=0;j<y; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}
		int a = sc.nextInt();
		int b= sc.nextInt();
		int[][]  arr2 = new int[a][b];
		for(int i =0 ; i<a; i++) {
			for(int j=0; j<b; j++) {
				arr2[i][j] = sc.nextInt();
			}
		}
		int[][] result = new int[x][b];
		for(int i=0; i<x;i++) {
			for(int j=0; j<b; j++) {
				result[i][j] = (arr1[j][0]*arr2[0][j])+(arr1[j][1]*arr2[1][j]);
				System.out.print(result[i][j]+ " ");
			}
			System.out.println();
		}
	}

}

*/