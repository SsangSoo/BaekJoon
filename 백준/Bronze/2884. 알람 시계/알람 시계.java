import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String hmStr = br.readLine();

        StringTokenizer stk = new StringTokenizer(hmStr);
        int h = 0, m = 0;
        while(stk.hasMoreTokens()) {
            h = Integer.valueOf(stk.nextToken());
            m = Integer.valueOf(stk.nextToken());
        }

        // 분에서 45를 뺀다.
        m = m - 45;
        // 분이 음수라면, 시간을 1 빼고, 분에도 60을 더해준다.
        if(m<0) {
            h--;
            m += 60;
        }
        // 시간이 음수라면, 24를 더해준다.
        if(h<0) h += 24;

        bw.write(h+" "+m);

        bw.flush();
        bw.close();
        br.close();
    }
}
