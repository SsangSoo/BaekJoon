import java.util.*;

class Main {

    public static void main(String[] args) {
     
         Scanner input = new Scanner(System.in);
         int count = input.nextInt();
         String str = input.next();
       
         long r = 31L;
         long M = 1234567891L;
    
         long sum = 0L;
         long pow = 1L;

         for(int index = 0; index < count; index++) {
         
             char ch = str.charAt(index);
             int i = ch - 96;

             sum = (sum + i * pow) % M;
             pow = (pow * r) % M;
         
         }
 
         System.out.println(sum);

     }


}
