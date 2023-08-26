import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        String nmStr = br.readLine();   // n과 m을 받는다.
        String[] nm = nmStr.split(" ");

        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]); // 가까워야 하는 수
        String numsStr = br.readLine();
        String[] nums = numsStr.split(" ");

        // 배열로
        int[] numArr = new int[n];
        for(int i=0; i<nums.length; i++) {
            numArr[i] = Integer.parseInt(nums[i]);
        }

        int min = Integer.MAX_VALUE; // 가까운 수와 최대한, 차이가 많이 나지 않는 수를 구하기 위한 변수

        int answer = 0;

        // 3번을 돌면서 체크한다.
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(i==j) continue;
                for(int k=0; k<n; k++) {
                    if(i==k || j==k) continue; // i와 j가 같을 때, 스킵
                    int sum = numArr[i] + numArr[j] + numArr[k]; // 세 수의 합
                    if(sum <= m) {  // 합이 m을 넘지 않아야 함.
                        int comparisonNum = m - sum;    // 넘지 않으면 차이를 계산해서
                        if(min > comparisonNum) {       // 차이가 적은 것을 
                            min = comparisonNum;        // 답에 저장한다.
                            answer = sum;
                        }
                    }
                }
            }
        }
        pw.print(answer);

        pw.flush();
        br.close();
        pw.close();
    }
}
