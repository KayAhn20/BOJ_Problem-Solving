package 오버플로우와모듈러;
/*
 * 
 *  15818번 문제  
 * 
 */

import java.util.Scanner;
public class Main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();

		long[] arr = new long[x];
		long result =1;
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextLong();
			result*=arr[i]%y;
			result%=y;
			
		}
		System.out.println(result);
		
		
	}
}
