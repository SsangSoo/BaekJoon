import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num1 = sc.nextLong();
        long num2 = sc.nextLong();

        long abs = Math.abs(num1 - num2);

        System.out.println(abs);

    }
}
