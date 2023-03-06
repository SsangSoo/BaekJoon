import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = new ArrayList<String>();

        while(true) {
            int num = scanner.nextInt();
            if(num==0) break;

            list.add(num + "");
        } // 문자열로 바꿔서 리스트에 넣음.

        int st; // standard 기준.

        String tmp1 = "";
        String tmp2 = "";

        for(String i : list) {
            
            if(i.length()==1) {
                System.out.println("yes");
                continue;
            }
            
            st = i.length()/2;

            if(i.length()%2==1) { // 홀수 기준 자리인덱스
                tmp1 = i.substring(0,st);
                tmp2 = i.substring(st+1);
            } else {              // 짝수 기준 자리인덱스
                tmp1 = i.substring(0,st);
                tmp2 = i.substring(st);
            }


            for(int j=0, k=st-1; j<st; j++, k--) {
                if ((tmp1.charAt(j) + "").equals(tmp2.charAt(k)+"")) { // 같으면,
                    if (j == st - 1) {   // 기준 자리인덱스 -1은 마지막 검증이고, 같기 때문에,
                        System.out.println("yes");  // yes 출력 후,
                        break;                      // 다음 요소,
                    } else {        // st-1이 아니면,
                        continue;   // continue;
                    }
                } else {    // 다르면,
                    System.out.println("no");   // no 출력 후,
                    break; // 해당반복문 벗어나고 다음요소.
                }
            } // for
        } // 이중 for
        scanner.close();
    } // 메서드
}