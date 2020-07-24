package 피보나치수4;
// BigInteger Class( 무한대의 정수)이용해서 출력..  #10826번 문제  

import java.io.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		BigInteger fibonacci[] = new BigInteger[N+3];
		fibonacci[0] = BigInteger.ZERO;
		fibonacci[1] = BigInteger.ONE;
		for(int i = 2; i <= N; i++){
			fibonacci[i] = fibonacci[i - 1].add(fibonacci[i - 2]);
		}
		bw.write(fibonacci[N] + "");
		bw.flush();
	}
}

