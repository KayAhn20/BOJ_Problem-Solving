package 네수;

// 10824 번 문제 
// StringBuilder 이용해서 풀었다... 
// int의 범위를 넘어서 long 으로풀었다.. 
import java.util.*;

public class Main {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		
		Scanner sc = new Scanner(System.in);
		
		
		
		StringBuilder x = sb.append(sc.nextInt());
		StringBuilder y = sb.append(sc.nextInt());
		String str = sb.toString();
		long num1 = Long.parseLong(str);
		
		
		
		StringBuilder n = sb2.append(sc.nextInt());
		StringBuilder m = sb2.append(sc.nextInt());
		String str2 = sb2.toString();
		long num2 = Long.parseLong(str2);
		
		
		
		long total = num1+num2;
		
		
		
		
		
		System.out.println(total);
	}
}
