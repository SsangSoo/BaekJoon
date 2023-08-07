import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String iStr = br.readLine();
        String arrStr = br.readLine();
        String findNumStr = br.readLine();

        int[] numArr = new int[Integer.valueOf(iStr)];
        String[] arrArr = arrStr.split(" ");

        // 숫자화
        for(int i=0; i < arrArr.length; i++) {
            numArr[i] = Integer.valueOf(arrArr[i]);
        }

        int findNum = Integer.valueOf(findNumStr); // 찾아야 할 수

        int result = 0;

        for(int x : numArr) {
            if(x==findNum) {
                result++;
            }
        }

        System.out.println(result);

        br.close();
    }
}