package 상수;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String x = sc.next();
		String y = sc.next();
		String temp = "";
		for(int i = x.length()-1; i >= 0 ; i--) {
			temp += x.charAt(i);
		}
		x = temp;
		temp = "";
		for(int i = y.length()-1; i >= 0 ; i--) {
			temp += y.charAt(i);
		}
		y = temp;
		int num1 = Integer.parseInt(x);
		int num2 = Integer.parseInt(y);
		
		if(num1>num2) {
			System.out.println(num1);
		}else {
			System.out.println(num2);
		}
	}
}