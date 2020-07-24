package A_TEST_PACKAGE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) throws IOException {
		long start = System.currentTimeMillis();
		long temp = 0;
		
		for(int i=1; i<2147483647;i++) {
			temp+=i;
		}
		System.out.println();
		
		
		
		
		long end = System.currentTimeMillis();
		System.out.println( "실행 시간 : " + ( end - start )/1000.0 );
		System.out.println(temp);
	}
}
