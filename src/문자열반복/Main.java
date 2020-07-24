package 문자열반복;
// 백준 문제  2675 ';;


import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			int x = sc.nextInt();
			String str = sc.next();
			for(int j=0; j<str.length(); j++) {
				for(int k = 0; k<x; k++) {
					System.out.print(str.charAt(j));
				}
			}
			System.out.println();
		}
		
		
		
		
	}
}
