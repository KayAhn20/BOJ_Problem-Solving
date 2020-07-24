package 스타트링크사무실을파헤쳐보자;

import java.util.*;
public class Main {
	public static void main(String[] args) {
		int[]  arr  = new int[5];
		arr[0]=65;
		arr[1]=17;
		arr[2]=4;
		arr[3]=4;
		arr[4]=64;
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println(arr[x-1]);
	}
}	
