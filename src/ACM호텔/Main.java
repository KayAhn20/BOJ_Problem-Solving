package ACM호텔;

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- >0 ) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			int N = sc.nextInt();
			int result = 0;
			int[][] ar = new int[H][W];
			for(int i =0 ; i<W; i++) {
				for(int j = 0; j<H; j++) {
					result++;
					if(result==N) {
						if(N%H==0) {
							System.out.println(H*100+(N/H));
						}else {
							
							System.out.println((N%H)*100+(N/H+1));
						}
					}
				}
			}
		}
	}
}
