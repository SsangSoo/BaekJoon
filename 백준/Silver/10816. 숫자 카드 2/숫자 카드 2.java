import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine().trim());

        String numCardStr = br.readLine();
        String[] numCardStrArr = numCardStr.split(" ");

        int[] positive = new int[10000000+1];
        int[] negative = new int[10000000+1];

        for(String str : numCardStrArr) {
            int num = Integer.parseInt(str);
            if(num < 0) {
                negative[num * -1]++;
            }
            if(num >= 0) {
                positive[num]++;
            }
        }

        int m = Integer.parseInt(br.readLine().trim());
        String problemNumStr = br.readLine().trim();
        String[] problemNumStrArr = problemNumStr.trim().split(" ");

        for(String str : problemNumStrArr) {
            int countNum = Integer.parseInt(str);

            if(countNum >= 0) {
                bw.write(positive[countNum] + " ");
            } else {
                bw.write(negative[countNum * -1] + " ");
            }
        }

        bw.flush();

        br.close();
        bw.close();
    }
}