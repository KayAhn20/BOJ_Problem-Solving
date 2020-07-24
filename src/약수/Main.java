package 약수;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
	static int n ;
	static String[] str; 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		n = Integer.parseInt(br.readLine());
		str = br.readLine().split(" ");
		int[] arr = new int[str.length];
		for(int i = 0; i<str.length; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		Arrays.sort(arr);
		int x = arr[0];
		int y = arr[arr.length-1];
		bw.write(x*y+ "");
		bw.flush();
		bw.close();
	}
}


