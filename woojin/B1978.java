package trdweek;
import java.io.*;
import java.util.*;

public class B1978 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        br.readLine();
        int c = 0; //count

        StringTokenizer st = new StringTokenizer(br.readLine());

        while(st.hasMoreTokens()) {
            // 소수인경우 true 아니면 false
            boolean p = true;

            int num = Integer.parseInt(st.nextToken()); //int형으로 토크나이저에 저장

            if(num == 1) {
                continue;
            }
            for(int i = 2; i <= Math.sqrt(num); i++) { //i가 num의 제곱근보다 작을때까지 i++해서 반복
                if(num % i == 0) {
                    p = false;
                    break;
                }
            }
            if(p) {
                c++;
            }
        }
        System.out.println(c);
    }
}
