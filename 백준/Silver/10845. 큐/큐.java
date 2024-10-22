import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int commandCount = Integer.parseInt(br.readLine());

        List<Integer> queue = new ArrayList<>();

        for(int i=0; i<commandCount; i++) {
            String command = br.readLine();

            if (command.startsWith("push")) {
                String[] commandArr = command.trim().split(" ");
                push(queue, Integer.parseInt(commandArr[1]));
            } else if(command.equals("front")) {
                front(queue);
            } else if (command.equals("pop")) {
                pop(queue);
            } else if (command.equals("size")) {
                size(queue);
            } else if (command.equals("empty")) {
                empty(queue);
            } else if (command.equals("back")) {
                back(queue);
            }

        }
        br.close();
    }

    static void push(List<Integer> queue, int num) {
        queue.add(num);
    }
    static void front(List<Integer> queue) {
        if(queue.size() == 0) {
            System.out.println(-1);
        } else {
            System.out.println(queue.get(0));
        }
    }
    static void pop(List<Integer> queue) {
        if(queue.size() == 0) {
            System.out.println(-1);
        } else {
            System.out.println(queue.remove(0));
        }
    }
    static void size(List<Integer> queue) {
        System.out.println(queue.size());
    }
    static void empty(List<Integer> queue) {
        if(queue.size() == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
    static void back(List<Integer> queue) {
        if(queue.size() == 0) {
            System.out.println(-1);
        } else {
            System.out.println(queue.get(queue.size() - 1));
        }
    }
}
