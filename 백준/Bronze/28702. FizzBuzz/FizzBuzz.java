import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] inputs = new String[3];
        for(int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.next();
        }

        boolean[] isString = new boolean[3];

        for(int i = 0; i < 3; i++) {
            if (isFizzBuzz(inputs[i])) {
                isString[i] = true;
            }
        }

        int[] numbers = new int[3];

        for(int i = 0; i < 3; i++) {
            if (!isString[i]) {
                switch (i) {
                    case 0:
                        caseZero(numbers, inputs[i]);
                        break;
                    case 1:
                        caseOne(numbers, inputs[i]);
                        break;
                    case 2:
                        caseTwo(numbers, inputs[i]);
                        break;
                }
            }
        }

        fizzBuzz(numbers[2] + 1);

    }

    private static void caseZero(int[] numbers, String input) {
        numbers[0] = Integer.parseInt(input);
        numbers[1] = numbers[0] + 1;
        numbers[2] = numbers[1] + 1;
    }

    private static void caseOne(int[] numbers, String input) {
        numbers[1] = Integer.parseInt(input);
        numbers[0] = numbers[1] - 1;
        numbers[2] = numbers[1] + 1;
    }

    private static void caseTwo(int[] numbers, String input) {
        numbers[2] = Integer.parseInt(input);
        numbers[1] = numbers[2] - 1;
        numbers[0] = numbers[1] - 1;
    }


    private static void fizzBuzz(int input) {
        int i = input;
        if(i > 0 && i % 3 == 0 && i % 5 == 0) {
            System.out.println("FizzBuzz");
        } else  if(i % 3 == 0 && i % 5 != 0) {
            System.out.println("Fizz");
        } else if(i % 3 != 0 && i % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(i);
        }
    }

    private static boolean isFizzBuzz(String input) {
        return input.equals("FizzBuzz") || input.equals("Fizz") || input.equals("Buzz");
    }

}
