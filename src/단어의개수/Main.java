package 단어의개수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int temp = 0;
		String[] strarr = br.readLine().split(" ");
		for(int i = 0; i < strarr.length; i++) {
			if(!strarr[i].isEmpty()) {
				temp++;
				//System.out.println(strarr[i]);
			}
		}
		System.out.println(temp);
	}
}
