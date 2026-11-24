import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int length = Integer.parseInt(br.readLine().trim());
        StringTokenizer st = new StringTokenizer(br.readLine());

        // A 배열초기화
        int[] arrA = new int[length];

        for(int index = 0; index < arrA.length; index++) {
            if (st.hasMoreTokens()) {
                arrA[index] = Integer.parseInt(st.nextToken());
            }
        }

        // B 배열
        int[] arrB = Arrays.copyOf(arrA, arrA.length);
        Arrays.sort(arrB);


        int[] resultArr = new int[length];

        for(int i = 0; i < arrB.length; i++) {
            for(int j = 0; j < arrA.length; j++) {
                if(arrB[i] == arrA[j]) {
                    resultArr[j] = i;
                    arrA[j] = -1;
                    break;
                }
            }
        }

        StringBuffer sb = new StringBuffer();
        for(int index = 0; index < length; index++) {
            if (index == length - 1) {
                sb.append(resultArr[index]);
            } else {
                sb.append(resultArr[index] + " ");
            }
        }

        bw.write(sb.toString());

        br.close();
        bw.close();

    }
}
