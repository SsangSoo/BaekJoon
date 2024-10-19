import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();

        int greatestCommonDivisor = 0; // 최대 공약수
        
        // 최대 공약수 구하기
        int firstTempNumber = first;
        int secondTempNumber = second;
        int tempResurt = 0;  
        
        while(true) {
            tempResurt = firstTempNumber % secondTempNumber;
            if(tempResurt == 0) {
                greatestCommonDivisor = secondTempNumber;
                break;
            }
            firstTempNumber = secondTempNumber;
            secondTempNumber = tempResurt;
        }


        int leastCommonMultiple = (first * second) / greatestCommonDivisor;    // 최소 공배수

        System.out.println(greatestCommonDivisor);
        System.out.println(leastCommonMultiple);

    }
}