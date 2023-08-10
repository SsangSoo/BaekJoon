import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        StringTokenizer stk = new StringTokenizer(s);

        int n = Integer.valueOf(stk.nextToken()); // 행
        int m = Integer.valueOf(stk.nextToken()); // 열

        int[][] arr = new int[n][m];

        String tmp; // 입력을 받는 임시 문자열 변수
        int rowCnt = 0; // 배열 행 카운트 변수
        int columnCnt = 0; // 배열의 열 카운트 변수

        int repeatCnt = 0; // while 조건에 넣을 변수
        while(repeatCnt < n) {  // 행의 개수만큼 반복문을 돌린다.
            tmp = br.readLine(); // 문자열을 토크나이저로 받는다.
            stk = new StringTokenizer(tmp, " ");

            // 문자열토큰을 수로 변환하면서 배열의 요소로 집어넣는다.
            while(stk.hasMoreTokens()) {
                arr[rowCnt][columnCnt] = Integer.valueOf(stk.nextToken()); // 배열의 각 요소로 집어넣는다.
                columnCnt++; // 열의 카운트를 더한다.
            }
            // 빠져나오면,
            // 행의 카운트는 1을 더하고,
            rowCnt++;
            // 열의 카운트는 초기화한다.
            columnCnt = 0;
            repeatCnt++;
        }

        repeatCnt = 0;
        rowCnt = 0;
        columnCnt = 0;
        while(repeatCnt < n) {   // 여기선 더해간다
            tmp = br.readLine();
            stk = new StringTokenizer(tmp);

            while(stk.hasMoreTokens()) {
                arr[rowCnt][columnCnt] = arr[rowCnt][columnCnt] + Integer.valueOf(stk.nextToken()); // 수를 더한다.
                columnCnt++;
            }
            // 빠져나오면,
            // 행의 카운트는 1을 더하고,
            rowCnt++;
            // 열의 카운트는 초기화한다.
            columnCnt = 0;
            repeatCnt++;
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                bw.write(arr[i][j]+" ");
            }
            bw.write("\n");
        }


        bw.flush();
        br.close();
        bw.close();
    }
}