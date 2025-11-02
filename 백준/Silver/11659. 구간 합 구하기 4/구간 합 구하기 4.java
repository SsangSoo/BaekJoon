import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // n 과 m을 입력받는다.
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // n 개의 수를 입력받은 것으로 합 배열을 만든다.
        st = new StringTokenizer(br.readLine());

        int[] sumArr = new int[n + 1];

        for(int i = 1; i <= n; i++) {
            sumArr[i] = sumArr[i - 1] + Integer.parseInt(st.nextToken());
        }

        // 구간을 m 번을 입력받아서 출력한다.
            // 이 때 i와 j에 -1을 해준 인덱스로 처리해야 한다.
            // 구간 합 : sumArr[j] - sumArr[i-1]
        for(int count = 0; count < m; count++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            bw.write(String.valueOf(sumArr[j] - sumArr[i - 1]) + "\n");
        }


        br.close();
        bw.close();

    }
}