package 보물;

// 1026번 문제..  성공함   
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int[] A = new int[x];
		Integer[] B = new Integer[x];
		int temp =0;
		for(int i = 0; i<x; i++) {
			A[i]=sc.nextInt();
		}
		for(int i= 0 ; i<x; i++) {
			B[i] = sc.nextInt();
		}
		Arrays.sort(A);
		Arrays.sort(B,Collections.reverseOrder());
		for(int i=0; i<x; i++) {
			temp+=A[i]*B[i];
		}
		System.out.println(temp);
	}
}
