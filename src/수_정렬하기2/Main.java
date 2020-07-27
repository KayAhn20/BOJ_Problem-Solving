package 수_정렬하기2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;


public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int x = Integer.parseInt(br.readLine());
		ArrayList<Integer> arrlist = new ArrayList<>();
		for(int i=0; i<x; i++) {
			arrlist.add(Integer.parseInt(br.readLine()));
		}
		Collections.sort(arrlist);
		for(int i=0; i<x; i++) {
			bw.write(arrlist.get(i)+"\n");
		}
		bw.flush();
		bw.close();
	}
}