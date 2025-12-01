import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int sLength =  Integer.parseInt(st.nextToken());
        int pLength =  Integer.parseInt(st.nextToken());

        String dnaString = br.readLine();

        st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int G = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());

        int[] dnaArr = new int[20];
        dnaArr['A' - 65] = A;
        dnaArr['C' - 65] = C;
        dnaArr['G' - 65] = G;
        dnaArr['T' - 65] = T;
        int[] currentArr = new int[20];

        int result = 0;

        char[] dnaCharArray = dnaString.toCharArray();

        for(int i=0; i < pLength; i++) {
            currentArr[dnaCharArray[i] - 'A']++;
        }
        result = compare(dnaArr, currentArr, result);

        for(int part = 1;  part <= sLength - pLength; part++) {

            currentArr[dnaCharArray[part - 1] - 'A']--;
            currentArr[dnaCharArray[part + (pLength - 1)] - 'A']++;

            result = compare(dnaArr, currentArr, result);
        }

        bw.write(String.valueOf(result));

        br.close();
        bw.close();

    }

    private static int compare(int[] dnaArr, int[] currentArr, int result) {
        if(
            currentArr[0] >= dnaArr[0] &&
            currentArr['C' - 'A'] >= dnaArr['C' - 'A'] &&
            currentArr['G' - 'A'] >= dnaArr['G' - 'A'] &&
            currentArr['T' - 'A'] >= dnaArr['T' - 'A']
        ) {
            result++;
        }
        return result;
    }

}