package 사탕게임_백준답지;

import java.util.*;
public class Main {
	
	
    public static int check(char[][] a) {
        int n = a.length;
        int ans = 1;
        for (int i=0; i<n; i++) {
            int max = 1;
            for (int j=1; j<n; j++) {
                if (a[i][j] == a[i][j-1]) {
                    max += 1;
                } else {
                    max = 1;
                }
                if (ans < max) {
                	ans = max;
                }
            }
            max = 1;
            for (int j=1; j<n; j++) {
                if (a[j][i] == a[j-1][i]) {
                    max += 1;
                } else {
                    max = 1;
                }
                if (ans < max) { 
                	ans = max;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] a = new char[n][n];
        for (int i=0; i<n; i++) {
            a[i] = sc.next().toCharArray();
        }
        int ans = 0;
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (j+1 < n) {													//	OOOOX	j가 4번 비교함  (오른쪽) 
                    char t = a[i][j];											//	OOOOX
                    a[i][j] = a[i][j+1];										//	OOOOX
                    a[i][j+1] = t;												//	OOOOX
                    int temp = check(a);										//	XXXXX
                    if (ans < temp) {								
                    	ans = temp;
                    }
                    t = a[i][j];
                    a[i][j] = a[i][j+1];
                    a[i][j+1] = t;
                }
                if (i+1 < n) {													// 아래 비교함.  
                    char t = a[i][j];
                    a[i][j] = a[i+1][j];
                    a[i+1][j] = t;
                    int temp = check(a);
                    if (ans < temp) {
                    	ans = temp;
                    }
                    t = a[i][j];
                    a[i][j] = a[i+1][j];
                    a[i+1][j] = t;
                }
            }
        }
        System.out.println(ans);
    }
}
