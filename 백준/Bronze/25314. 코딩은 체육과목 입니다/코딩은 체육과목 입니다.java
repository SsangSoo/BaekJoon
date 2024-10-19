import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n /= 4;

        StringBuffer sb = new StringBuffer();

        for(int i=0; i<n; i++) {
            sb.append("long ");
        }
        sb.append("int");

        String result = sb.toString();
        System.out.println(result);
    }
}
