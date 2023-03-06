import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().toUpperCase().split("");
        int[] arr = new int[26];

        for(int i=0; i<str.length; i++) {
            arr[str[i].charAt(0)-65]++;
        }
        
        int max = arr[0];
        int idx = 0;
        for(int i=1; i<arr.length; i++) {    
            if (max < arr[i]) {                
                max = arr[i];                      
                idx = i;                            
            } else if (max > arr[i]) {
                continue;                       
            }
        }


        int maxCnt = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]==max) {
                maxCnt++;

            }
        }

        if(maxCnt>1)  
            System.out.println("?");
        else
            System.out.println((char)(idx+65));

        br.close();
    }
}