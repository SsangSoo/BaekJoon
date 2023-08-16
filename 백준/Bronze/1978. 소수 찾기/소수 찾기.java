import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int n = Integer.parseInt(s); // 첫줄

        s = br.readLine();
        String[] numStr = s.split(" ");
        int[] numArr = new int[numStr.length]; // 두번째줄

        // 배열로 바꾸기
        for(int i=0; i<numArr.length; i++) {
            numArr[i] = Integer.parseInt(numStr[i]);
        }

        // 최댓값 // 역순으로 나올 수도 있기 때문에, ex) 3 \n 7 2 3 
        int max = numArr[0];
        for(int i = 0; i<numArr.length; i++) {
            if(max < numArr[i]) max = numArr[i];
        }

        int[] primeNums = new int[max + 1];

        for(int i=2; i < primeNums.length; i++) { // 2부터 각 수로 집어넣기
            primeNums[i] = i;
        }
        for(int i=2; i<=max; i++) {
            if(primeNums[i]==0) continue;
            for(int j=i+i; j<=max; j += i) {
                primeNums[j] = 0;
            }
        }

        int result = 0;

        for(int i=0; i < numArr.length; i++) {
            if(primeNums[numArr[i]]!=0) result++; // 0이 아니면 소수이기에 카운트 +1
        }

        System.out.println(result);

        br.close();
    }
}