import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];

        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int i = 0;
        int j = arr.length-1;
        int result = 0;

        while(i < j) {
            int sum = arr[i] + arr[j];
            if(sum < M) {
                i++;
            } else if (sum == M) {
                result++;
                i++;
                j--;
            } else {
                j--;
            }
        }

        bw.write(String.valueOf(result));

        br.close();
        bw.close();
    }
}