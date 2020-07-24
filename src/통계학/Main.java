package 통계학;
import java.util.ArrayList;
/*
 * 
 * 
 * 2108 번 문제  
 * 
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int total=0;
		int[] arr = new int[x];
		int[] find = new int[8001]; // 음수 -4000 에서 양수 4000까지 
									//((입력되는 정수의 절댓값은 4,000을 넘지 않는다.))
		ArrayList <Integer> arrlist = new ArrayList<>();
		for(int i=0; i< x; i++) {
			arr[i]=sc.nextInt();
			total+=arr[i];
			find[arr[i]+4000]++;
		}
		Arrays.sort(arr);
		System.out.println((int)Math.round((double)total/x));
		System.out.println(arr[x/2]);
		
		int max =0;
		for(int i=0; i<8001; i++) {
			if(find[i]>=max) {
				max = find[i];
			}
		}
		for(int i=0; i<8001; i++) {
			if(find[i]==max) {
				arrlist.add(i-4000);
			}
		}
		if(arrlist.size()==1) {
			System.out.println(arrlist.get(0));
		}else {
			Collections.sort(arrlist);
			System.out.println(arrlist.get(1));
		}
		int second_arr_size=0;
		if(x==1) {
			second_arr_size=0;
		}else {
			second_arr_size= arr[arr.length-1]-arr[0];
		}
		
		System.out.println(second_arr_size);
		
	}
}
