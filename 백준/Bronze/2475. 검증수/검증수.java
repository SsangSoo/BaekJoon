import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.trim();
        
        String[] strArr = str.split(" ");
        
        int sum=0;
        int num;
            
        for(int i=0; i<strArr.length; i++) {
            num = Integer.parseInt(strArr[i]);
            sum += num*num;
        }
        
        System.out.println(sum%10);
 
    }
}