import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[31];

        String tmp;

        while((tmp = br.readLine()) != null) {
            if(!tmp.equals("")) {
                int i = Integer.valueOf(tmp);
                arr[i] = i;
            } else break;
        }

        for(int i=1; i < arr.length; i++) {
            if(arr[i]==0) {
                bw.write(i + "\n");
            }
        }

        bw.flush();

        bw.close();
        br.close();
    }
}
