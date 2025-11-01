import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        String inputNum = br.readLine();

        long sum = 0L;

        for (char ch : inputNum.toCharArray()) {
            sum += ch;
        }
        sum -= '0' * n;

        bw.write(String.valueOf(sum));

        br.close();
        bw.close();
    }
}
