package 동혁피자;


import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int order = 1;
		int total;
		int totalr;
		while(true) {
			int r = sc.nextInt();
			if(r==0) {
				break;
			}
			int w = sc.nextInt();
			int l = sc.nextInt();
			if(r!=0) {
				r = (int) Math.pow(2*r, 2);
				w = (int) Math.pow(w, 2);
				l = (int) Math.pow(l, 2);
				//System.out.println(r);
				//System.out.println(w);
				//System.out.println(l);
				total = w+l;
				totalr =r;
				if(totalr>total) {
					System.out.println("Pizza "+ order + " fits on the table.");
					order++;
				}else if(totalr==total) {
					System.out.println("Pizza "+ order + " fits on the table." );
					order++;
				}else {
					System.out.println("Pizza "+ order + " does not fit on the table." );
					order++;
				}
			}
		}
	}
}
