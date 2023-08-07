import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 > 0 && num2 > 0) {  // 1 사분면
            System.out.println(1);
        } else if (num1 < 0 && num2 > 0) { // 2사분면
            System.out.println(2);
        } else if (num1 < 0 && num2 < 0) { // 3사분면
            System.out.println(3);
        } else { // 그 외 4사분면
            System.out.println(4);
        }
    }
}
