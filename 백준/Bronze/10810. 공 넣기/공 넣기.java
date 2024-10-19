import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int basketQuantity = scanner.nextInt();
        int[] baskets = new int[basketQuantity+1];

        int number = scanner.nextInt();
        for(int i=0; i < number; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            int k = scanner.nextInt();

            for(int j=start; j<=end; j++) {
                baskets[j] = k;
            }
        }

        StringBuffer sb = new StringBuffer();

        for(int i=1; i < baskets.length; i++) {
            sb.append(baskets[i] + " ");
        }
        System.out.println(sb.toString().trim());

    }
}
