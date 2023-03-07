import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        StringTokenizer stk;

        int num1;
        int num2;

        for(int i=0; i<count; i++) {
            stk = new StringTokenizer(br.readLine());
            num1 = Integer.valueOf(stk.nextToken());
            num2 = Integer.valueOf(stk.nextToken());

            System.out.println(num1+num2);
        }
        br.close();
    }
}