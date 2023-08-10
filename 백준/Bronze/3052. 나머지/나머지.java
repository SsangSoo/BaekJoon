import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = 0; // 10개 입력받을 때 while에서 카운트를 위한 변수

        Set set = new HashSet(); // 나머지를 set에 계속 넣어서 마지막에 size만 돌려준다. // set은 중복을 허용하지 않기 때문이다.

        String readStr;
        while(cnt<10) { // 카운트가 10보다 작을 떄 까지
            readStr = br.readLine();

            int num = Integer.valueOf(readStr);
            set.add(num%42);
            cnt++;
        }
        bw.write(set.size()+"");

        bw.flush();
        br.close();
        bw.close();
    }
}