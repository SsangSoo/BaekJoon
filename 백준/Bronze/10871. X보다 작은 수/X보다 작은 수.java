import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();

        String str = sc.next()+sc.nextLine();

        String result = "";

        StringTokenizer stk = new StringTokenizer(str," ");

        while(stk.hasMoreTokens()) {
            Integer num = Integer.valueOf(stk.nextToken());
            if(num < x) {
                result += num+" ";
            }
        }
        System.out.println(result);

    }
}