package 배수와약수;

import java.util.Scanner;

public class Main {
	public static int factor(int x, int y) {
		if(y%x==0) {
			return 1;
		}else {
			return 0;
		}
	}
	public static int multiple(int x, int y) {
		if(x%y==0) {
			return 1;
		}else {
			return 0;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = "";
		while(true) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			if(x<y) {
				if(factor(x,y)==1) {
					System.out.println("factor");
					continue;
				}
			}else if(x>y) {
				if(multiple(x,y)==1) {
					System.out.println("multiple");
					continue;
				}else {
					System.out.println("neither");
					continue;
				}
			}else if(x==0 && y==0) {
				break;
			}
		}
	}
}
