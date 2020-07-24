package 분수찾기;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int x = Integer.parseInt(br.readLine());
		int y = 1;
		int z = 2;
		int line = 1;
		while(x>y) {
			y += z;
			z++;
			line++;
		}
		int temp = y-x;
		int index = line-temp;
		int bi = line-index+1;
		int up=0,down=line-index+1;
		for(int i = 1; i<=index; i++) {
			up++;
		}
		String even = up+"/"+down;
		String odd = down+"/"+up;
		if(line%2==0) {
			bw.write(even);
		}else {
			bw.write(odd);
		}
		bw.flush();
		bw.close();
	}
}
