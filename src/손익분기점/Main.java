package 손익분기점;

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); //a 는 초기비
		int b = sc.nextInt();	// 자재
		int c = sc.nextInt();		//판매하려는 값
		if(b>=c) {
			System.out.println(-1);
		}else {
			System.out.println(a/(c-b)+1);
		}
	}
}
