import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] intArr = str.split(" ");

        Long result = 0L;

        for (int i = 0; i < intArr.length; i++) {
            result += Long.parseLong(intArr[i]);
        }

        System.out.println(result);
    }
}
