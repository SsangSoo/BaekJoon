import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();

        System.out.println(first + second - third);

        String str = "" + first + second;
        int strNumber = Integer.parseInt(str);
        System.out.println(strNumber - third);

    }
}
