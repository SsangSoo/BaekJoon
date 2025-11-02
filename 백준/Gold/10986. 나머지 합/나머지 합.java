import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long[] arr = new long[N+1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        long[] sumArr = new long[N+1];
        long[] remainder = new long[M];

        for(int i=1; i<=N; i++) {
            sumArr[i] = sumArr[i - 1] + arr[i];
        }

        long answer = 0;
        for(int i=1; i<=N; i++) {
            sumArr[i] = sumArr[i] % M;
            if(sumArr[i] == 0) {
                answer++;
            }
            remainder[(int)sumArr[i]]++;
        }

        for(int i=0; i<M; i++) {
            if(remainder[i] > 1) {
                answer = answer + (remainder[i] * (remainder[i] - 1) / 2);
            }
        }

        bw.write(String.valueOf(answer));

        br.close();
        bw.close();
    }
}