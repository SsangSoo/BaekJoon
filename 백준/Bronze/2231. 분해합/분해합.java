import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // 몇 자리수인지 구하기
        int digitsCount = 1;

        int numCopy = num;
        while(true) {
            if(numCopy / 10 > 0) {
                digitsCount++;
                numCopy = numCopy / 10;
            }
            if(numCopy < 10) {
                break;
            }
        }

        int loopStart = num - (digitsCount * 9);

        int result = 0;

        for(int idx = loopStart; idx < num; idx++) {
            int temp = idx;
            int decomposition = 0;
            while(temp > 0) {
                decomposition += temp % 10;
                temp /= 10;
            }

            if(decomposition + idx == num) {
                result = idx;
                break;
            }
        }
        System.out.println(result);
        sc.close();
    }
}