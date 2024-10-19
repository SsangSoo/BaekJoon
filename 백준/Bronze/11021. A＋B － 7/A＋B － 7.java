import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=1; i<=t; i++) {
            int first = sc.nextInt();
            int second = sc.nextInt();
            System.out.println("Case #" + i + ":" + " " + (first+second));
        }
    }
}
