package 네번째점;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int x = 3;
		int[] a = new int[1001];
		int[] b = new int[1001];
		while(x-->0) {
			String[] str = br.readLine().split(" ");
			int first = Integer.parseInt(str[0]);
			int second = Integer.parseInt(str[1]);
			a[first]++;
			b[second]++;
		}
		for(int i=1; i<=1000; i++) {
			if(a[i]==1) {
				System.out.print(i);
			}
		}
		System.out.print(" ");
		for(int i=1; i<=1000; i++) {
			if(b[i]==1) {
				System.out.print(i);
			}
		}
	}
}
