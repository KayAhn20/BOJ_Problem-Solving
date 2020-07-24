package 별찍기16;

//10991문제 ;;;




import java.util.Scanner;
//앞의 빈칸을 미리 출력해준 뒤, 뒤의 별은 2로 나누어 떨어지면 빈칸 출력, 아니면 *출력으로 풀어준다.   
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 1; i <= n; i++){
            for (int j = i; j <= n - 1; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i*2-1; j++){
                if (j % 2 == 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
