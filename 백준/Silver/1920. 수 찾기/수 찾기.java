import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String numStrN = br.readLine(); // 개수
        String nNums = br.readLine();   // 수들
        String numStrM = br.readLine(); // 개수
        String mNums = br.readLine();   // 수들

        String[] nArr = nNums.split(" ");
        List<String> nList = Arrays.stream(nArr)
                .collect(Collectors.toList());

        Set<String> set = new HashSet<>(nList);

        String[] mArr = mNums.split(" ");

        for(String num : mArr) {
            if(set.contains(num)) {
                bw.write(1+"\n");
            } else {
                bw.write(0+"\n");
            }
        }

        bw.flush();
        br.close(); bw.close();
    }
}