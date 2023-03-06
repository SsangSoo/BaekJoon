import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      	int A = scanner.nextInt();
      	int B = scanner.nextInt();
      	int tmp = B;
      	while(tmp>0) {
      		System.out.println( A * (tmp%10) );
      		tmp /= 10;
      	}
      	System.out.println(A*B);
    }
}