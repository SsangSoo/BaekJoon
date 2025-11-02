import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Coordinate[] arr = new Coordinate[N];

        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[i] = new Coordinate(x, y);
        }

        Arrays.sort(arr);

        for(Coordinate c : arr) {
            bw.write(c.x + " " + c.y + "\n");
        }

        br.close();
        bw.close();

    }

    static class Coordinate implements Comparable<Coordinate>{

        int x;
        int y;

        public Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Coordinate o) {
            if(this.x == o.x) {
                return this.y - o.y;
            }
            return this.x - o.x;
        }
    }
}
