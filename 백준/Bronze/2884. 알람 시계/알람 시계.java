import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();

        // 분에서 45를 뺀다.
        m = m - 45;
        // 분이 음수라면, 시간을 1 빼고, 분에도 60을 더해준다.
        if(m<0) {
            h--;
            m += 60;
        }

        // 시간이 음수라면, 24를 더해준다.
        if(h<0) h += 24;

        System.out.println(h+" "+m);

    }
}
