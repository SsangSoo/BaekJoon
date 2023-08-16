import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int tmp = n - 1; // 값을 구하기 위해 1을 뺀다.

        int i = 0;
        while(true) {
            tmp -= i * 6;
            if(tmp <= 0) {
                break;
            }
            i++;
        }

        System.out.println(n == 1 ? 1 : i+1); // 1의 영역을 더해줘야하기 때문에 1을 더해서 출력
        sc.close();
    }
}