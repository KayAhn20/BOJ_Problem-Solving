package 로또번호추첨기;
// 여기서 키포인트는 랜덤과 중복인데. 중복을 제거하고자 할 때 아주 유용하게 쓰이는 자료구조는 set이다.
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>(); // 중복을 없애는 
		
		int[] arr = new int[6];
		Random ran = new Random();
		
		for (int i = 0; i < 6; i++) {
			set.add(ran.nextInt(45));
		}
		System.out.println(set);
	}
}
