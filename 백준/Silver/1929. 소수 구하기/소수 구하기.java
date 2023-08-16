import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String nums = br.readLine();
        String[] s = nums.split(" ");

        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        int[] numArr = new int[m+1];    // 인덱스 0부터

        // 에라토스테네스의 체
        for(int i=2; i < numArr.length; i++) {  // 자기자신의 값으로 인덱스를 채운다. // 2부터
            numArr[i] = i;                  
        }

        // 자기 자신은 지우지 않으면서 배수를 지운다. // 2부터
        for(int i = 2; i <= m; i++) {
            if(numArr[i]==0) continue;  // 0이이면 지워진 수이므로, 넘어간다.
            for(int j=i+i; j <= m; j += i) {
                numArr[j] = 0;
            }
        }

        for(int i=n; i<numArr.length; i++) {
            if(numArr[i]!=0) {
                bw.write(numArr[i]+"\n");
            }
        }

        bw.flush();
        bw.close(); br.close();
    }
}