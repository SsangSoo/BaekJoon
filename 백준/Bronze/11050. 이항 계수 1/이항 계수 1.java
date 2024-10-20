import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int nMinusK = n - k;

        int denominator = 1;
        for(int i=n; i>0; i--) {
            denominator *= i;
        }

        int moleculesLeft = 1;
        for(int i=nMinusK; i>0; i--) {
            moleculesLeft *= i;
        }

        int moleculesRight = 1;
        for(int i=k; i>0; i--) {
            moleculesRight *= i;
        }

        int result = denominator / (moleculesLeft * moleculesRight);
        System.out.println(result);
    }
}
