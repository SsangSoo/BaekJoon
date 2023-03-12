import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str;
        StringTokenizer stk;

        while(!(str = br.readLine()).equals("")) {

            stk = new StringTokenizer(str);

            int a = Integer.valueOf(stk.nextToken());
            int b = Integer.valueOf(stk.nextToken());
            int c = Integer.valueOf(stk.nextToken());

            // 각 수에 제곱해 줌.
            a *= a;
            b *= b;
            c *= c;

            if(a==0L && b==0L && c==0L) break;  // 마지막줄 0 0 0 => break;
            else if(a+b==c || b+c==a || a+c==b) {
                bw.write("right");
                bw.newLine();
            } else {
                bw.write("wrong");
                bw.newLine();
            }
        }

        bw.close();
        br.close();
    }
}