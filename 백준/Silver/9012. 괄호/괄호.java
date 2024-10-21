
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int lineNumber = Integer.parseInt(br.readLine());

        List<String> parenthesisStack = new ArrayList<>();

        for(int i=0; i<lineNumber; i++) {
            String parenthesisStr = br.readLine();
            String[] split = parenthesisStr.split("");


            boolean loopEnd = true;

            for(int j=0; j<split.length; j++) {
                if (split[j].equals("(")) {
                    parenthesisStack.add("(");
                } else if(split[j].equals(")")) {
                    if(parenthesisStack.size() == 0) {
                        bw.write("NO\n");
                        loopEnd = false;
                        break;
                    }
                    parenthesisStack.remove(parenthesisStack.size() - 1);
                }
            }
            
            if(loopEnd && parenthesisStack.size() == 0) {
                bw.write("YES\n");
            } else if(loopEnd && parenthesisStack.size() > 0) {
                bw.write("NO\n");
            }
            parenthesisStack.clear();
        }

        bw.flush();

        br.close();
        bw.close();
    }
}
