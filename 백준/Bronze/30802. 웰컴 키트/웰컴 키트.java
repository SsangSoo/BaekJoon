import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int participants = sc.nextInt();

        int[] tArr = new int[6];

        for(int i=0; i<tArr.length; i++) {
            tArr[i] = sc.nextInt();
        }

        int bundleT = sc.nextInt();
        int bundlePen = sc.nextInt();

        int tBundle = 0;

        for(int i=0; i<tArr.length; i++) {
            tBundle += tArr[i] / bundleT;
            if(tArr[i] % bundleT > 0) {
                tBundle++;
            }
        }

        System.out.println(tBundle);

        int penBundle = participants / bundlePen;
        int penPiece = participants % bundlePen;

        System.out.println(penBundle + " " + penPiece);

    }
}