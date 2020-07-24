package 회사에있는사람;

// # 7785번  다시 보기....

// 중요 포인트:

// Iterator, hashmap(K,V), 2 dimensional array;


/*
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for(int i=0; i<x; i++) {
			String people = sc.next();
			String inout = sc.next();
			if(inout.equals("enter")) {
				list.add(people);
			}else {
				list.remove(people);
			}
		}
		Collections.sort(list);
		for(int i =list.size()-1; i>=0; i--) {
			System.out.println(list.get(i));
		}
		sc.close();
	}
}
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		String[][] names = new String[n][2]; // 이차원 배열로 이름과 현재 상태를 분리하여 저장
		for (int i = 0; i < n; i++)
			names[i] = br.readLine().split(" ");// 공백을 기준으로 배열에 저장
		HashMap<String, String> lists = new HashMap<String, String>(); //해쉬맵을 통해 직원명은 key, 현재상태는 value로 저장
		for (int i = 0; i < n; i++) {
			if (names[i][1].equals("enter"))// 해당이름을 갖는 직원의 상태가 'enter'상태면
				lists.put(names[i][0], names[i][1]);// 해쉬맵에 저장
			else // 'enter'가 아니면
				lists.remove(names[i][0]);// 해당이름을 현재 해쉬맵에서 찾아 삭제
		}
		Set<String> keys = lists.keySet();// 해쉬맵 리스트에 저장된 직원 명단을 정렬하기 위해
		Iterator<String> it = keys.iterator();// set과 iterator클래스로 처리
		String[] result = new String[lists.size()];// 정렬된 직원리스트를 저장하기 위한 문자열 배열
		int index = 0;
		while (it.hasNext()) {
			result[index] = it.next();// String타입 배열에 직원리스트 저장
			index++;
		}
		Arrays.sort(result);// 직원 명단 오름차순으로 정렬
		for (int i = 0; i < result.length / 2; i++) { // 배열을 내림차순으로 정렬하기위해
			String tmp = result[i];
			result[i] = result[result.length - 1 - i];// result배열의 맨 앞과 맨 뒤 원소를 교체
			result[result.length - 1 - i] = tmp;
		}
		for (String str : result) // 내림차순 정렬이 끝난 result배열 출력
			bw.write(str + "\n");
		bw.flush();
	}
}