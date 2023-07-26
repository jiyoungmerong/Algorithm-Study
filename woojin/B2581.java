package fourweek;
import java.io.*;
import java.util.*;
public class B2581 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine()); // 최소값
        int N = Integer.parseInt(br.readLine()); // 최대값
        int sum = 0; // 합 저장할곳
        int min = 10000;

        for(int i=M; i<=N; i++){ // 소수 구하는 반복문
            boolean check = true;
            if(i == 1){ // 1은 소수가 아니라서 건너뜀
                continue;
            }
            for(int j = 2; j<=Math.sqrt(i); j++){
                if(i % j == 0){
                    check = false;
                }
            }
            if(check){ // 소수일때 소수 합을 sum에 누적
                sum += i;
                if(min > i){ // 소수중 최소값 구하기
                    min = i;
                }
            }
        }
        if(min == 10000){ // 소수 값 없으면 -1 출력
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
