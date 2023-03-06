import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.valueOf(br.readLine());
        String str = "";

        for(int i=1; i<=num; i++) {
            bw.write(i + "\n");
        }


        bw.close();
        br.close();
    }
}