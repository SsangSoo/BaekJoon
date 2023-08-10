import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long resultLong = 1;

        String tmp;
        while ((tmp = br.readLine()) != null) {
            if(tmp.equals("")) break;
            resultLong *= Long.valueOf(tmp);
        }

        String result = resultLong + "";

        int[] arr = new int[10]; // 0~9

        for(int i=0; i<result.length(); i++) {
            int arrCnt = result.charAt(i) - '0'; // 한 요소 한 요소의 수가 무엇인지 구한다.
            arr[arrCnt]++; // 수의 요소를 카운팅한다.
        }

        for(int i=0; i<arr.length; i++) {   // BufferedWriter에 쓴다.
            bw.write(arr[i]+"");        // 수만 넣으면 글자 인코딩 깨짐.
            bw.write("\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}