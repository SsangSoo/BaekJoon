import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = 1;

        if(num == 0) {
            System.out.println(result);
        } else {
            while(num>0) {
                result *= num;
                num--;
            }
            System.out.println(result);
        }
    }
}
