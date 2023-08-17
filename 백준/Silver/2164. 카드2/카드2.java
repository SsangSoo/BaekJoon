import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        int n = Integer.parseInt(s);


        Queue<Integer> queue = new LinkedList<>();

        for(int i=1; i<=n; i++) {
            queue.add(i);
        }

        int i = 1;
        int tmp = 0;
        while(queue.size()!=1) {
            if(i%2==1) {
                queue.remove();
            } else {
                tmp = queue.remove();
                queue.add(tmp);
            }
            i++;
        }

        bw.write(queue.peek()+"");


        bw.flush();
        bw.close(); br.close();
    }
}
