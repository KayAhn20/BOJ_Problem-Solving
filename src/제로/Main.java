package 제로;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		while(x-->0) {
			int num = sc.nextInt();
			if(num==0) {
				stack.pop();
			}else {
				stack.push(num);
			}
			
		}
		long temp = 0;
		while(stack.size()!=0) {
			temp+=stack.pop();
		}
		System.out.println(temp);
		
	}
}
