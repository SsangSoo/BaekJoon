
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        int result = input.length();

        for(int i=0; i < input.length(); i++) {
            result += dial(input.charAt(i));
        }

        System.out.println(result);
    }

    static int dial(char ch) {
        int value = (int) ch;

        switch(value) {
            case 65: case 66: case 67: {
                value = 2;
                break;
            }
            case 68: case 69: case 70: {
                value = 3;
                break;
            }
            case 71: case 72: case 73: {
                value =  4;
                break;
            }
            case 74: case 75: case 76: {
                value = 5;
                break;
            }
            case 77: case 78: case 79: {
                value = 6;
                break;
            }
            case 80: case 81: case 82: case 83: {
                value = 7;
                break;
            }
            case 84: case 85: case 86: {
                value = 8;
                break;
            }
            case 87: case 88: case 89: case 90:
                value = 9;
                break;
        }

        return value;


    }
}