package BinarytoOcta;
// #1373  2진수-> 8진수 변환 .. 3자리씩 끊어서 읽히는게 포인트...;;

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringBuilder answer = new StringBuilder();
		
		String str = br.readLine();
		int zero_test = Integer.parseInt(str);
		if(zero_test==0) {
			answer.append(0);
		}else {
			if(str.length()%2==0) {
				sb.append("0");
				sb.append(str);
			}else {
				sb.append(str);
			}
			String ready = sb.toString();
			int[] arr = new int[ready.length()/3];
			for(int i=0; i<arr.length; i++) {
				arr[i] = Integer.parseInt(ready.substring(i*3, (i*3)+3));
			}
			for(int i=0; i<arr.length; i++) {
				if(arr[i]==0) {
					arr[i]=0;
					
				}else if(arr[i]==1) {
					arr[i]=1;
					answer.append(arr[i]);
				}else if(arr[i]==10) {
					arr[i]=2;
					answer.append(arr[i]);
				}else if(arr[i]==11) {
					arr[i]=3;
					answer.append(arr[i]);
				}else if(arr[i]==100) {
					arr[i]=4;
					answer.append(arr[i]);
				}else if(arr[i]==101) {
					arr[i]=5;
					answer.append(arr[i]);
				}else if(arr[i]==110) {
					arr[i]=6;
					answer.append(arr[i]);
				}else if(arr[i]==111) {
					arr[i]=7;
					answer.append(arr[i]);
				}
			}
		}
		bw.write(answer+"");
		bw.flush();
		bw.close();

	}
}
