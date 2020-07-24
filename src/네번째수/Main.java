package 네번째수;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		for(int i = 0; i< arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int x = (arr[1]-arr[0]);
		int y = (arr[2]-arr[1]);
		//System.out.println(x+"        "+y);
		//System.out.println(Arrays.toString(arr));
		if(y>x) {
			arr[1]+=x;
			System.out.println(arr[1]);
		}else if(y==x){
			arr[2]+=x;
			System.out.println(arr[2]);
		}else {
			arr[0]+=y;
			System.out.println(arr[0]);
		}
		
		
		
	}
}
