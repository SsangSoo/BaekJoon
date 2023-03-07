import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if(str.replaceAll(" ","").equals("12345678")) {
            System.out.println("ascending");
        } else if(str.replaceAll(" ","").equals("87654321")) {
            System.out.println("descending");
        } else System.out.println("mixed");

        br.close();
    }
}