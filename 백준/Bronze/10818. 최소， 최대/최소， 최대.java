import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        StringTokenizer stk = new StringTokenizer(br.readLine()," ");

        int num = Integer.valueOf(stk.nextToken());
        int max = num;
        int min = num;

        while(stk.hasMoreTokens()) {
            num = Integer.valueOf(stk.nextToken());
            if(max < num) max = num;

            if(min > num) min = num;
        }

        System.out.printf("%d %d",min, max);

        br.close();
    }
}