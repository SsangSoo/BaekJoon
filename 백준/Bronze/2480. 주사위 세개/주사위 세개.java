import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();

        int result = 0;

        if(first == second) {
            if(second == third) {
                result += (10000 + (first * 1000));
            } else {
                result += (1000 + (first * 100));
            }
        } else if(third == first || third == second) {
            result += (1000 + (third * 100));
        } else {
            int max = Math.max(first, second);
            max = Math.max(max, third);
            result = max * 100;
        }

        System.out.println(result);
    }
}