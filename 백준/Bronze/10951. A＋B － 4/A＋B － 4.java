import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stk;

        int num1=0;
        int num2=0;

        String str;
        String result = "";

        while((str = br.readLine()) != null) {
            result = "";
            stk = new StringTokenizer(str, " ");
            num1 = Integer.valueOf(stk.nextToken());
            num2 = Integer.valueOf(stk.nextToken());

            System.out.println(num1+num2);
        }

        br.close();
    }
}
