
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputNum1 = sc.next();
        String inputNum2 = sc.next();

        String num1Str = "";
        String num2Str = "";

        for(int i=inputNum1.length() - 1; i>=0; i--) {
            num1Str += inputNum1.charAt(i);
            num2Str += inputNum2.charAt(i);
        }

        int num1 = Integer.parseInt(num1Str);
        int num2 = Integer.parseInt(num2Str);

        int result = num1 > num2 ? num1 : num2;

        System.out.println(result);

    }
}
