import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int totalScore = 0;
        int max = 0;

        for (int i = 0; i < count; i++) {
            int score = sc.nextInt();
            totalScore += score;

            if(max < score) {
                max = score;
            }
        }

        float average = ((float) totalScore / max * 100) / count;

        System.out.println(average);

    }
}
