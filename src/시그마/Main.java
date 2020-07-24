package 시그마;

/*
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] str = br.readLine().split(" ");
		int[] arr = new int[2];
		arr[0]= Integer.parseInt(str[0]);
		arr[1]= Integer.parseInt(str[1]);
		Arrays.sort(arr);
		int x = arr[0];
		int y = arr[1];
		int result=0;
			for(int i=x; i<=y; i++) {
				result+=i;
			}
		
			
		bw.write(result+"");
		bw.flush();
		bw.close();
	}
}
*/

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		long start = System.currentTimeMillis();

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] str = br.readLine().split(" ");
		int[] arr = new int[2];
		arr[0]= Integer.parseInt(str[0]);
		arr[1]= Integer.parseInt(str[1]);
		Arrays.sort(arr);
		long x = arr[0];
		long y = arr[1];
		long result=0;
		
		if((y-x)%2!=0) {
			result = (y+x) * ((y-x+1)/2);
		}else{
			result = ((y+x) * ((y-x)/2)) + ((x+y)/2);
		}
		long end = System.currentTimeMillis();

		System.out.println( "실행 시간 : " + ( end - start )/1000.0 );
			
		bw.write(result+"");
		bw.flush();
		bw.close();
		

	}
}