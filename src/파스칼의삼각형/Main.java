package 파스칼의삼각형;

import java.util.Scanner;

/*
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int[][] arr = new int[x][x]; // 6 = 0-5
		for(int k=0; k<x-1;k++) {
			arr[k][0]=1;
			arr[k][arr.length-1]=1;
		}
		
		for(int i=2; i<x; i++) {
			for(int j=1; j<x; j++) {
				arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
			}
			
		}
		for(int i=0; i<x; i++) {
			for(int j=0; j<x; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
		
		
		
		
		
	}
}
*/
public class Main {

	public static int N;
	public static int M;
	public static int[][] pascalArray;

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);


		N = sc.nextInt();
		M = sc.nextInt();


		pascalArray = new int[31][31];

		for(int i=0; i<31; i++){
			for(int j=0; j<31; j++){
				if(j==0 || j==i){
					pascalArray[i][j] = 1;

				}else{
					if(i-1 >= 0){
						pascalArray[i][j] = pascalArray[i-1][j-1] + pascalArray[i-1][j];
					}

				}

			}
		}

		System.out.println(pascalArray[N-1][M-1]);
	}


}