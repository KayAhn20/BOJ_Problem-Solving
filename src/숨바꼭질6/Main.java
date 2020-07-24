package 숨바꼭질6;


import java.util.*;

public class Main {
	public static int gcd(int x, int y) {
		if(y==0) {
			return x;
		}else {
			return gcd(y, x%y);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int bro = sc.nextInt();
		int mylocation = sc.nextInt();
		int[] BroLocation = new int[bro];
		for(int i=0; i<bro;i++) {
			BroLocation[i] = ((sc.nextInt())-mylocation);
			if(BroLocation[i]<=0) {
				BroLocation[i] = -BroLocation[i];
			}
			//System.out.println(BroLocation[i]);
		}
		int result = 0;
		
		if(bro==1) {
			result = BroLocation[0];
		}else {
			result = BroLocation[0];
			for(int i=1; i<BroLocation.length; i++) {
				result = gcd(result,BroLocation[i]);
			}
		}
		System.out.println(result);
	}
}
