package Self_Number;
// 백준 문제 4673 ;;
public class Main {
	 
    public static void main(String[] args) {
        boolean[] isNotSelfNumber = new boolean[10001];		// boolean 타입의 배열만들
         
        for (int i = 1; i <= 10000; i++) {		//
            int dn = getDn(i);
            if (dn <= 10000) {
                isNotSelfNumber[dn] = true;             
            }
        }
         
        for (int i = 1; i < isNotSelfNumber.length; ++i) {
            if (!isNotSelfNumber[i]) {
                System.out.println(i);              
            }
        }
        System.out.println(getDn(2));
       
    }
    private static int getDn(int n) {		// 계산 메소드..
        int dn = n;							// 입력받은 인자 n(1부터 10000까지) 을 dn에다 넣어준다.  
        while(n > 0) {						// 인자가 0이 될때 까지..
            dn += n % 10;					// 인자를 10으로 나눈 나머지를 dn에 추가 해준다..
            n /= 10;						// n을 10으로 나눈 값을 다시 n에 넣어준다. 
        }
        return dn;							// n이 0보다 작을때 결과도출. 
    }
    
    
    //Example.getDn(100) = 
    // dn = 100,  n = 100
    // 100> 0
    // dn = dn + 0;
    // n = 100/10;
    // 10 > 0
    
}
