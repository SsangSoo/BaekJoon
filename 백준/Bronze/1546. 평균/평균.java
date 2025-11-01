import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // n을 입력받는다.
        int n = Integer.parseInt(br.readLine());
        // 점수를 담을 n개의 수를 담을 배열을 생성해놓는다.
        int[] scoreArr = new int[n];

        // 문자열을 입력받는다.
        String input = br.readLine();
        // 배열처리 한다.
        String[] scores = input.split(" ");
        // 처리한 배열을 이전에 생성한 배열로 담는다.
        for(int i = 0; i < scoreArr.length; i++) {
            scoreArr[i] = Integer.parseInt(scores[i]);
        }

        // 최댓값을 구한다.
            // Math 클래스 사용
        int max = scoreArr[0];
        for(int i = 1; i < scoreArr.length; i++) {
            max = Math.max(max, scoreArr[i]);
        }


        // 배열을 순회하면서 총합을 구한다.
            // score / max * 100
        double sum = 0;
        for(int score : scoreArr) {
            sum += (double) score / max * 100;
        }

        bw.write(String.format("%.2f", (sum / n)));

        br.close();
        bw.close();
    }
}