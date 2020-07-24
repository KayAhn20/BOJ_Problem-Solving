package 듣보잡;

//1764번 문제   
// set과 list를 이용해서 풀었던 문제   

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException {
		
		Set<String> set = new HashSet<String>();
		ArrayList<String> list = new ArrayList<String>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		while(n-->0) {
			String s = br.readLine();
			set.add(s);
		}
		while(m-->0) {
			String s = br.readLine();
			if(set.contains(s)) {
				list.add(s);
			}
		}
		Collections.sort(list);
		int size = list.size();
		StringBuilder sb = new StringBuilder();
		for(String str : list) {
			sb.append(str).append("\n");
		}
		System.out.println(size);
		System.out.print(sb);
		
		
	}
}
