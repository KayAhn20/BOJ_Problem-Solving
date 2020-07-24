package First_Dimension_Array;

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] ar = new int[N];
		int max = -100000;
		int min = 1000000;
		for(int i=0; i<N; i++) {
			ar[i] = sc.nextInt();
			
			if(ar[i]>max) {
				max = ar[i];
			}
			if(ar[i]<min) {
				min = ar[i];
			}
		}
		System.out.println(min +" " + max);
	}

}
