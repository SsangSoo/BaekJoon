import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        List<String> list = new ArrayList<>();

        for(int i=0; i<num; i++) {
            list.add(br.readLine());
        }

        String str;

        int totalScore=0;
        int score;

        Iterator it = list.iterator();
        while(it.hasNext()) {
            str = (String)it.next();
            score = 0;
            for(int j=0; j < str.length(); j++) {
                if((str.charAt(j)=='O')) {
                    totalScore += ++score;
                } else {
                    score = 0;
                }
            }
            System.out.println(totalScore);
            totalScore = 0;
        }
        br.close();
    }
}