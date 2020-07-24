package 오늘은2007년;

import java.util.Scanner;

public class Main {
	static int result=0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		switch(x) {
			case 1 : result = y-1;
				break;
			case 2 : result = 31+y-1;
				break;
			case 3 : result = 31+28+y-1;
				break;
			case 4 : result = 31+28+31+y-1;
				break;
			case 5 : result = 31+28+31+30+y-1;
				break;
			case 6 : result = 31+28+31+30+31+y-1;
				break;
			case 7 : result = 31+28+31+30+31+30+y-1;
				break;
			case 8 : result = 31+28+31+30+31+30+31+y-1;
				break;
			case 9 : result = 31+28+31+30+31+30+31+31+y-1;
				break;
			case 10 : result = 31+28+31+30+31+30+31+31+30+y-1;
				break;
			case 11: result = 31+28+31+30+31+30+31+31+30+31+y-1;
				break;
			case 12: result = 31+28+31+30+31+30+31+31+30+31+30+y-1;
				break;
		}
		if(result%7==0) {
			System.out.println("MON");
		}else if(result%7==1) {
			System.out.println("TUE");
		}else if(result%7==2) {
			System.out.println("WED");
		}else if(result%7==3) {
			System.out.println("THU");
		}else if(result%7==4) {
			System.out.println("FRI");
		}else if(result%7==5) {
			System.out.println("SAT");
		}else if(result%7==6) {
			System.out.println("SUN");
		}
	}
}
