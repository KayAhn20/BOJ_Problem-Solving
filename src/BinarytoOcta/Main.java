package BinarytoOcta;
// #1373  2진수-> 8진수 변환 .. 3자리씩 끊어서 읽히는게 포인트...;;

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int x = Integer.parseInt(br.readLine());
		int[] arr = new int[1000000];
		for(int i =0; i<x; i++) {
			arr[i]=x%10;
			x=x/10;
			System.out.print(arr[i]);
		}
		System.out.println();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
