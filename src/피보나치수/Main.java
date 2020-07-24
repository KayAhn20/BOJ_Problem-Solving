package 피보나치수;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main{
	
	public int fib(int x) {
		if(x==0) {
			return 0;
		}else if(x==1) {
			return 1;
		}else {
			return fib(x-1)+fib(x-2);
		}
	}

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int x = Integer.parseInt(br.readLine());
		int result = 0;
		Main main = new Main();
		
		if(x<=45 && x>=0) {
			result = main.fib(x);
		}
		bw.write(result+"");
		bw.flush();
		bw.close();
	}

}
