package 알파벳개수;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int[] arr = new int[26];
		for(int i=0; i<str.length(); i++) {
			arr[str.charAt(i)-97]++;
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
}
