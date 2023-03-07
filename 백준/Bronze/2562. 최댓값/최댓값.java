import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> list = new ArrayList<>();

        for(int i=0; i<9; i++) {
            list.add(Integer.valueOf(br.readLine()));
        }

        int max=0;
        int tmp;

        Iterator it = list.iterator();
        while(it.hasNext()) {
            tmp = Integer.valueOf((Integer)it.next());
            if(max < tmp) max = tmp;
        }

        System.out.printf("%d%n%d", max, list.indexOf((Integer)max)+1);
    }
}
