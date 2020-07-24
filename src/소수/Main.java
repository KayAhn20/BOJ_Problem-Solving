package 소수;
 

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int temp =0;
		int result = 1000000;
		boolean[] prime = new boolean[n+1];
		prime[0]=true;
		prime[1]=true;
		
		for (int i = 2; i <= n; i++) { 		//2부터 끝까지 
			for (int j = 2; i*j <= n; j++) { // 2부터 i*j가 end 될때까지 
				
				prime[i * j] = true;
			}
			
		}
		for(int i = m; i<=n; i++) {
			
			if(prime[i]==false) {
				
				temp +=i;
				if(result>temp) {
					result=temp;
				}
			}
		}
		if(temp==0) {
			result=-1;
		}
		if(temp>0) {
			System.out.println(temp);
		}
		System.out.println(result);
		
	}
}