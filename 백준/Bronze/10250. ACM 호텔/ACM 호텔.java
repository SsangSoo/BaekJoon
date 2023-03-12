import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.valueOf(br.readLine());

        StringTokenizer stk;
        String str;
        String result = "";
        for(int k=0; k<num; k++) {

            if(!(str = br.readLine()).equals("")) {
                stk = new StringTokenizer(str);

                int h = Integer.valueOf(stk.nextToken());
                int w = Integer.valueOf(stk.nextToken());
                int n = Integer.valueOf(stk.nextToken());

                int[][] arr = new int[h][w];

                int rn = 0; // 호수

                int tmpNum = 0;

                for (int i = 0; i < w; i++) {        // 열(높이)순   // 헷갈리는데 종이로 그려놓고, 그림 돌려보면 쉬움.
                    for (int j = 0; j < h; j++) {    // 행(넓이)순
                        tmpNum++;
                        rn = (j + 1)*100 + (i + 1);

                        if (tmpNum == n) break;
                    }
                    if (tmpNum == n) break;
                }
                System.out.println(rn);

            } else break;
         }

        br.close();
    }
}