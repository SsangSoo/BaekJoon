import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String numStr = br.readLine();
        int num = Integer.parseInt(numStr);

        // 중복 제거를 위해 Set을 활용
        Set<String> set = new HashSet(num);

        for(int i=0; i < num; i++) {
            set.add(br.readLine());
        }

        String[] strArr = new String[set.size()];

        // set을 배열로
        Object[] objects = set.toArray();
        int i = 0;
        for(Object obj : objects) {
            strArr[i] = (String) obj;
            i++;
        }

        Arrays.sort(strArr); // 사전 순 // sort의 기본 사전순
        Arrays.sort(strArr, new LenComparator()); // 길이순

        for(String str : strArr) {
            bw.write(str+"\n");
        }

        bw.flush();
        bw.close(); br.close();
    }
}


class LenComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        if(s1.length() > s2.length()) return 1;
        else if(s1.length() == s2.length()) return 0;
        else return -1;
    }
}