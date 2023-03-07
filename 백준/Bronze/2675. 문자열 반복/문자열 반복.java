import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.valueOf(br.readLine());

        List<Integer> numList = new ArrayList<>();
        List<String> strList = new ArrayList<>();

        StringTokenizer stk;

        for(int i=0; i < count; i++) {
            stk = new StringTokenizer(br.readLine());

            numList.add(Integer.valueOf(stk.nextToken()));  // 수
            strList.add(stk.nextToken());                   // 문자열
        }

        String str = "";
        String result = "";
        int tmp = 0;
        while(tmp<numList.size()) {
            str = strList.get(tmp);

            for(int i=0; i<str.length(); i++) {
                for(int j=0; j<numList.get(tmp); j++) {
                    result += str.charAt(i);
                }
            }
            bw.write(result);
            result = "";
            bw.newLine();
            tmp++;
        }

        br.close();
        bw.close();
    }
}
