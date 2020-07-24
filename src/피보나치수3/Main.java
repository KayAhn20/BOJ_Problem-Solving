package 피보나치수3;
// #2749번 문제 피사노의 주기 이용한 문제....
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        
        int DIV = 1000000;
        int pisano = 1500000;
        
        t = t%pisano;
        
        long[] fibo = new long[pisano+1];
        fibo[1] = 1;
        
        for(int i=2; i <= pisano; i++) {
            fibo[i] = (fibo[i-1] + fibo[i-2])%DIV;
        }
        
        System.out.println(fibo[(int)t]);
    }
}


