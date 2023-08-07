import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.valueOf(br.readLine());

        for(int i=0; i<num; i++) {
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int num1 = Integer.valueOf(stk.nextToken());
            int num2 = Integer.valueOf(stk.nextToken());
            bw.write(num1+num2 + "\n");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
