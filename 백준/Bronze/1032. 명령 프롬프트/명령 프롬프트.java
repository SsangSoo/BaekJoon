import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int lineCount = Integer.parseInt(br.readLine().trim());

        List<String> list = new ArrayList<>();
        for(int index = 0; index < lineCount; index++) {
            list.add(br.readLine());
        }

        char[] chArr = null;

        for(int index = 0; index < lineCount; index++) {
            String prompt = list.get(index);
            if(index == 0) {
                chArr = prompt.toCharArray();
                continue;
            }

            for (int chIndex = 0; chIndex < chArr.length; chIndex++) {
                if(prompt.charAt(chIndex) != chArr[chIndex]) {
                    chArr[chIndex] = '?';
                }
            }
        }

        bw.write(chArr);

        br.close();
        bw.close();

    }
}
