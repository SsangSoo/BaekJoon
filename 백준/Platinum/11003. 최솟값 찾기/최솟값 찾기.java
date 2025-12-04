import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());


        Node[] arr = new Node[N+1];

        for(int i = 1; i <= N; i++) {
            arr[i] = new Node(i, Integer.parseInt(st.nextToken()));
        }

        Deque<Node> deque = new ArrayDeque<>(L);
        deque.addFirst(arr[1]);
        bw.write(deque.getFirst().value + "");

        for(int i = 2; i <= N; i++) {
            // 인덱스를 확인
            // 첫 번째 node의 인덱스와 현재 i의 인덱스 차이가 L 보다 작아야 함.
            while(!deque.isEmpty() && i - deque.getFirst().index >= L) {
                deque.removeFirst();
            }

            // 탐색
            while(!deque.isEmpty() && deque.peekLast().value > arr[i].value) {
                // 이미 들어가있는 값이 크면,
                // 큰 거 빼기
                deque.removeLast();
            }

            // 현재 것을 넣기
            deque.addLast(arr[i]);

            bw.write(" " + deque.getFirst().value);
        }


        br.close();
        bw.close();

    }

    static class Node {
        int index;
        int value;

        Node(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }
}