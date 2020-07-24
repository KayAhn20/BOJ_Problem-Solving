package 벌집;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int circleScope = 1; // 벌집의 범위
        int commonDifference = 6; // 등차수열
        int room = 1; // 거쳐가는 방의 갯수
        
        while(n > circleScope) {
            
            circleScope += commonDifference;
            commonDifference += 6; // 등차는 6이다
            room ++;
        }
        bw.write(String.valueOf(room));
        bw.flush();
    }
 

}
