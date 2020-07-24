package 소풍;

/*
 * 
 * 백트래킹으로 문제를 해결하였다.
보통 이런식으로 모든 방법의 수를 구하는 방법은 백트래킹으로 구하는 경우가 많은 것 같다.
이와 반대로 가장 먼저 도달하는 방법을 구하는 경우는 BFS가 많은 것 같은데... 
이것도 더 익숙해져서 문제를 바로바로 어떤식으로 풀지 머릿 속에 나올 정도가 됐으면 좋겠다....

먼저 친구관계를 저장해줄 friends 라는 이차원 boolean배열을 만들어서 친구관계를 저장하였고, 
짝이 정해졌는 지 확인해줄 visited라는 boolean 배열도 만들어 주었다.

이 후 재귀함수를 만들어서 아직 짝이 없는 친구들을 짝을 주어지는 식으로 백트래킹을 해줬다.
구현 코드는 아래와 같다.

 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    static int N = 0;
    static int M = 0;
    static int count = 0;
    static boolean[][] friends;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        int C = Integer.parseInt(br.readLine().trim());   // test 케이스
        while(C-->0){
            count= 0;
            solution();
            System.out.println(count);
        }
    }

    private static void solution() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        friends = new boolean[N][N];    // friends[2][2];
        visited = new boolean[N];		// visited[2];
        //st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            int person1 = Integer.parseInt(st.nextToken());
            int person2 = Integer.parseInt(st.nextToken());

            friends[person1][person2] = true;
            friends[person2][person1] = true;
        }

        dfs();
    }

    private static void dfs() {
        int person = findNotQueue();

        if(person<0){
            count++;
            return;
        }

        for (int i = 0; i < N; i++) {
            if(i == person) continue;
            if(friends[person][i] && !visited[i]){
                visited[person] = true;
                visited[i] = true;
                dfs();
                visited[person] = false;
                visited[i] = false;
            }
        }
    }

    private static int findNotQueue() {
        for (int i = 0; i < N; i++) {
            if(!visited[i]) return i;
        }
        return -1;
    }
}
