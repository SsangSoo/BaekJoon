import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isLowerCase(ch)) // 소문자라면
                pw.write(Character.toUpperCase(ch));
            else {
                pw.write(Character.toLowerCase(ch));
            }
        }
        pw.flush();

        br.close();
        pw.close();
    }
}
