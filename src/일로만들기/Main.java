package 일로만들기;
// #1463번 문제...
//
// DP 문제.. 
//
//
// Top down 방식.. 
import java.util.*;

public class Main {
    public static int[] d;
    
    public static int go(int n) {
        if (n == 1) {
            return 0;
        }
        if (d[n] > 0) { 		// 이미 구해진 값들을 다시 재귀로 부르지 않기 위해 기저 사례 만들어 놓음.. 
            return d[n];
        }
        d[n] = go(n-1) + 1;
        if (n%2 == 0) {
            int temp = go(n/2)+1;
            System.out.println("2temp           "+temp);
            if (d[n] > temp) {
                d[n] = temp;
                System.out.println("2                 " + temp);
            }
        }
        
        if (n%3 == 0) {
            int temp = go(n/3)+1;
            System.out.println("3temp           "+temp);
            if (d[n] > temp) {
                d[n] = temp;
                System.out.println("3                 " + temp);
            }
        }
        return d[n];
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        d = new int[n+1];
        
        System.out.println(go(n));
        
    }
}


// 밑 코드는 Bottom-up 방식 .. 


/*
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();	//여기서는 10이라고 하겠음..
        int[] d = new int[n+1]; // 10이면 11개 만들기 
        d[1] = 0;  // 1일때 값 선언..
        for (int i=2; i<=n; i++) {   // 2부터 찾는 값까지... 
            d[i] = d[i-1] + 1;		// 점화식 
            if (i%2 == 0 && d[i] > d[i/2] + 1) {  // 2로 나뉘어 지거나 d[4]> d[2]+1 이면,
                d[i] = d[i/2] + 1;				// d[4] = d[2]+1;
            }
            if (i%3 == 0 && d[i] > d[i/3] + 1) { // 3으로 나뉘어 지거나 d[6]>d[2]+1 이면,
                d[i] = d[i/3] + 1;				// d[6] = d[2]+1;
            }
        }
        System.out.println(d[n]);
    }
}
*/