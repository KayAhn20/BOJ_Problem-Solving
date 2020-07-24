package 블랙잭;

import java.io.BufferedReader;
import java.io.InputStreamReader;
 
class Main {
    static BufferedReader br;
    static int N;
    static int M;
    static int max;
    static int result;
    static int[] arr;
    static boolean[] visited;
    static String[] str;
 
    public static void DFS(int start, int depth, int sum) { // depth first search.. (깊이우선탐색)  
        //depth가 0부터 시작 했으므로 depth==2이면 3개의 카드를 골랐을 경우이다. // depth는 고른 카드의 갯수.. 
        if (depth == 2) {								//3개를 다 골랐다면  
            //M보다 크지않은 최대값을 고른다.
            if (Math.abs(M - sum) < max && sum <= M) { // 만약 (21-sum)의 절대값  <21억 && sum<= 21
                max = Math.abs(M - sum);				//  (21-sum)의 절대값
                result = sum;							// result  = sum
            }
            return;
        }
        //3개를 고르는 알고리즘.visited[] 함수를 통해 백트래킹으로 구현했다.
        for (int i = start; i < N; i++) {
            if (visited[i])
                continue;
            visited[i] = true;
            DFS(i + 1, depth + 1, sum + arr[i]);
            visited[i] = false;
        }
    }
    public static void main(String[] args) throws Exception {
    	br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine().split(" ");  		// 5 21  
        N = Integer.parseInt(str[0]);			// N = 5  
        M = Integer.parseInt(str[1]);			// M = 21 
        max = Integer.MAX_VALUE;				
        arr = new int[N];						// 크기 5짜리 정수형 배열  
        visited = new boolean[N];				// 크기 5짜리 true/false  
        str = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        //-----------------입력부-----------------
        
        for (int i = 0; i < N; i++) {
            visited[i] = true;
            DFS(i, 0, arr[i]);
            visited[i] = false;
        }
        System.out.println(result);
    }
 
  
 
}
