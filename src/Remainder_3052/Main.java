package Remainder_3052;


import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[10];
		int[] result = new int[42];
		int[] temp = new int[10];
		int count =0;
		for(int i=0;i<ar.length;i++) {
			ar[i] = sc.nextInt();
			result[ar[i]%42]++;
		
		}
		for(int i=0;i<result.length;i++) {
			if(result[i]!=0) {
				count++;
			}
		}
		for(int i=0;i<result.length;i++) {
			
			System.out.print(result[i]+" ");
		}
		System.out.println(count);
	}

}
