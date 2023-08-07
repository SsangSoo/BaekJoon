import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String tmp;

        while((tmp = br.readLine()) != null) {
            bw.write(tmp+"\n");
            bw.flush();
        }

        br.close();
        bw.close();
    }
}
