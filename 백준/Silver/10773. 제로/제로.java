
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        for(int i=0; i<n; i++) {
            int k = sc.nextInt();

            if(k==0) {
                list.remove(list.size() - 1);
            } else {
                list.add(k);
            }
        }

        int result = 0;

        for(Integer num : list) {
            result += num;
        }

        System.out.println(result);

    }
}
