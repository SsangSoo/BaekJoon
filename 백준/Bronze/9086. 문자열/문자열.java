import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.valueOf(br.readLine());

        for(int i=0; i < num; i++) {
            String tmp = br.readLine();
            bw.write(tmp.charAt(0) + "" + tmp.charAt(tmp.length()- 1) + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
