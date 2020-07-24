package 소트인사이드;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		Stack <Integer> stack = new Stack<>();
		while(x!=0) {
			int temp=0;
			temp = x%10;
			stack.push(temp);
			x/=10;
		}
		int size = stack.size();
		int[] arr = new int[size];
		for(int i=0; i<size; i++) {
			arr[i]=stack.pop();
		}
		Arrays.sort(arr);
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]);
		}
	}
}
