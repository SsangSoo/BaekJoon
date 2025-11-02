import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // N과 M을 입력받는다.
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // N+1 * N+1 의 이차원 배열을 입력받는다.
        int[][] sumArr = new int[N+1][N+1];

        // 각 행마다의 구간 합을 담는다.
        for(int i=1; i<=N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<=N; j++) {
                sumArr[i][j] = sumArr[i][j-1] + Integer.parseInt(st.nextToken());
            }
        }

        // 입력받은 좌표로 구간 합을 구한다.
        for(int count=0; count<M; count++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            // 2,2 -> 3,4 => 2~3 행 | 2~4 까지의 구간합
                // 2~3행 (x1 -> x2) | 2~4 까지의 구간합은 y1=2 y2=4 : sumArr[y2] - sumArr[y1-1] = sumArr[4] - sumArr[1] (y1 -> y2)
            int sum = 0;
            for(int i=x1; i<=x2; i++) {
                sum += sumArr[i][y2] - sumArr[i][y1-1];
            }
            bw.write(sum + "\n");
        }

        br.close();
        bw.close();
    }
}