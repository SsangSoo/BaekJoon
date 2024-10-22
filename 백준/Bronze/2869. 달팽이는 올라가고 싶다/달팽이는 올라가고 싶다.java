import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        c = c - a;
        int result = c / (a - b);

        if(c % (a - b) > 0) {
            result++;
        }

        System.out.println(result + 1);
    }
}
