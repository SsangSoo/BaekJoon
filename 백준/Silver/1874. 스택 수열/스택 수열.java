import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        List<String> printList = new ArrayList<>();

        Stack stack = new Stack(n);

        int number = 1;

        for(int i = 0; i < arr.length; i++) {
            while(!stack.peek(arr[i])) {
                if(!stack.push(number++, printList)) {
                    printList.add("NO");
                    break;
                }
            }
            if (stack.peek(arr[i])) {
                stack.pop(arr[i], printList);
            }
        }

        boolean possible = true;

        for(int i = 0; i < printList.size(); i++) {
            if (printList.get(i).equals("NO")) {
                System.out.println("NO");
                possible = false;
                break;
            }
        }

        if(possible) {
            for(int i = 0; i < printList.size(); i++) {
                System.out.println(printList.get(i));
            }
        }
    }


    static class Stack {

        List<Integer> list;
        int capacity;

        public Stack(int capacity) {
            this.capacity = capacity;
            this.list = new ArrayList<>(capacity);
        }

        boolean push(int num, List<String> printList) {
            if(list.size() < capacity) {
                printList.add("+");
                list.add(num);
                return true;
            }
            return false;
        }

        boolean pop(int num, List<String> printList) {
            if(list.size() > 0) {
                printList.add("-");
                list.remove(new Integer(num));
                return true;
            }
            return false;
        }

        boolean peek(int num) {
            if(list.size() > 0) {
                return list.get(list.size() - 1) == num;
            }
            return false;
        }

    }
}
