package ROT13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
				if ('Z' < str.charAt(i) + 13) {
                    // 13 옮겼을 때 알파벳 대문자의 범위를 벗어나면
                    bw.write(('A' - 1) + ((str.charAt(i) + 13) - 'Z'));
				} else {
                    // 아니면
                    bw.write(str.charAt(i) + 13);
                }
			}else if(str.charAt(i)>='a' && str.charAt(i)<='z') {
				if('z' < str.charAt(i)+13) {
					bw.write(('a' -1) + ((str.charAt(i)+13)- 'z'));
				}else {
					bw.write(str.charAt(i)+13);
				}
            } else {
                // 소문자나 대문자 아니면 그냥 출력
                bw.write(str.charAt(i));
			}
		}
		bw.flush();
		bw.close();
	}
}	
