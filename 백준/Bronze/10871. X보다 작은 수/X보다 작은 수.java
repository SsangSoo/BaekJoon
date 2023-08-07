import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String nxStr = br.readLine();
        String[] nx = nxStr.split(" ");
        int n = Integer.valueOf(nx[0]);
        int x = Integer.valueOf(nx[1]);

        String str = br.readLine();

        String result = "";

        StringTokenizer stk = new StringTokenizer(str," ");

        while(stk.hasMoreTokens()) {
            Integer num = Integer.valueOf(stk.nextToken());
            if(num < x) {
                bw.write(num+" ");
            }
        }
        bw.flush();

        br.close();
        bw.close();

    }
}