import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> stack = new ArrayList<>();

        int lineNumber = Integer.parseInt(br.readLine().trim());

        for(int i=0; i<lineNumber; i++) {
            String command = br.readLine();

            if(command.startsWith("push")) {
                push(stack, Integer.parseInt(command.split(" ")[1]));
            } else if(command.equals("pop")) {
                pop(stack);
            } else if(command.equals("size")) {
                size(stack);
            } else if(command.equals("empty")) {
                empty(stack);
            } else if(command.equals("top")) {
                top(stack);
            }
        }

        br.close();
    }

    static void push(List<Integer> stack, int num) {
        stack.add(num);
    }

    static void pop(List<Integer> stack) {
        if(stack.isEmpty()) {
            System.out.println(-1);
        } else {
            System.out.println(stack.remove(stack.size() - 1));
        }
    }

    static void size(List<Integer> stack) {
        System.out.println(stack.size());
    }

    static void empty(List<Integer> stack) {
        System.out.println(stack.size() == 0 ? 1 : 0);
    }

    static void top(List<Integer> stack) {
        if(stack.isEmpty()) {
            System.out.println(-1);
        } else {
            System.out.println(stack.get(stack.size() - 1));
        }
    }


}