import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] isbn = input.next().split("");
        int sum = 0;

        boolean isThree = false;

        for(int i = 0; i < isbn.length - 1; i++) {
            String numberStr = isbn[i];
            if (isNumber(numberStr)) {
                int num = Integer.parseInt(numberStr);
                if( i % 2 == 0) {
                    sum += num;
                } else {
                    sum += num * 3;
                }
            } else {
                if( i % 2 != 0) {
                    isThree = true;
                }
            }
        }

        sum += Integer.parseInt(isbn[12]);
        int result = sum % 10 ;


        if(isThree && result != 0) {
            for(int i = 0; i < 10; i++) {
                if(10 - result == (i * 3) % 10) {
                    result = i;
                    break;
                }
            }
        } else if (!isThree && result != 0) {
            result = 10 - result;
        }

        System.out.println(result);

    }

    private static boolean isNumber(String split) {
        return !split.equals("*");
    }
}
