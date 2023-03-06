import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        
        int num = s.nextInt();
        
        for(int i=1; i<=9; i++) {
            System.out.printf("%d * %d = %d%n", num, i, num*i);
        }
        
    }
}