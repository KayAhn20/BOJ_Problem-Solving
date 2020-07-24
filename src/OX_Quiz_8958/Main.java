package OX_Quiz_8958;


import java.util.*;
import java.io.*;


public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		String[] str = new String[num];
		for(int i=0; i<str.length; i++) {
			str[i]= br.readLine();
		}
		br.close();
		for(String result : str) {
			//OXOXOXOXOXOXO
			//IO
			int count = 0;
			int total = 0;
			for(int i=0; i<result.length(); i++) {
				if(result.charAt(i)=='O') {
					total+= ++count;
				}else {
					count = 0;
				}
			}System.out.println(total);
		}
	}
}
