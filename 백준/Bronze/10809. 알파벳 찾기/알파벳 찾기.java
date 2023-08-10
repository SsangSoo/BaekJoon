import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();

        int[] alpaArr = new int[26]; // 각 소문자 위치를 담기 위해 선언한 변수

        for(int i=0; i<alpaArr.length; i++) { // 일단 -1로 다 초기화 했다.
            alpaArr[i] = -1;
        }

        for(int i=97; i<123; i++) { // 소문자 알파벳이 97~122 // 알파벳 a부터 순서대로 들어간다.
            alpaArr[i - 97] = str.indexOf((char) i + ""); // i-97로 하면 alpaArr 순서대로 들어감.

        }

        for(int i=0; i<alpaArr.length; i++) { // 처음 위치 값을 순서대로 입력
            bw.write(alpaArr[i] + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}