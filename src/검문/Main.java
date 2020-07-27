package 검문;

/*
 * 
 * 
 * 입력된 수들을 오름차순으로 정렬한 뒤 인접한 수들의 차이들 모두의 최대공약수를 구하고, 그 최대공약수의 약수가 답이 된다. 어째서 그런 것인지.. 수학적인 증명은 아직 잘 모르겠다. 더 생각해봐야지 ㅜㅜ  
 * 
 * 
 * 
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x =sc.nextInt();
		int[] arr = new int[x];
		boolean bool = false;
		int max = 0;
		
		for(int i = 0; i< arr.length; i++) {
			arr[i] = sc.nextInt();
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		int[][] darr = new int[x][max];
		for(int i=0; i<x; i++) {
			for(int j = 1; j<=max; j++) {
				darr[i][j-1] = arr[i]%j;
			}
		}
		/*
		for(int i=0;i<x; i++) {
			for(int j = 0; j<max; j++) {
				System.out.print(darr[i][j]+",");
			}
			System.out.println();
		}
		*/
		//브루트 포스로 체크 
		Queue<Integer> q = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		for(int k=0; k<max; k++) {
			for(int i = 0; i<x-1; i++) {
				for(int j = i+1; j<i+2; j++) {
					if(darr[i][k]==darr[j][k]) {
						bool = true;
					}else {
						bool = false;
					}
				}
			}
			if(bool==true && k!=0) {
				q.offer(k+1);
				sb.append(q.poll()+" ");
			}
		}
		System.out.println(sb);
		
	}
}
