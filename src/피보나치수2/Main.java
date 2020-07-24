package 피보나치수2;

import java.util.Scanner;
import java.math.BigInteger;

public class Main{
	
	

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int x =sc.nextInt();
		
		BigInteger arr[] = new BigInteger[91];
		arr[0]=BigInteger.ZERO;
		arr[1]=BigInteger.ONE;
		for(int i=2; i<=arr.length-1; i++) {
			arr[i] = arr[i-1].add(arr[i-2]);
		}
	
		if(x<=90) {
			if(x==0) {
				System.out.println(arr[0]);
			}else if(x==1) {
				System.out.println(arr[1]);
			}else {
				System.out.println(arr[x]);
			}
		}
		
		
		
	}

}
