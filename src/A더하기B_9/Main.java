package A더하기B_9;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BigInteger big1 = sc.nextBigInteger();
		BigInteger big2 = sc.nextBigInteger();
		BigInteger result = big1.add(big2);
		System.out.println(result);
	}
}
