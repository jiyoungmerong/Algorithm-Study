package BoJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class baek_2501 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // N 저장
        int K = Integer.parseInt(st.nextToken()); // K 저장

        int count = 0; // 순서
        int result = 0; // 결과

        for(int i = 1; i<= N; i++){
            if(N % i == 0)
                count++; // 약수 나오면 +1

            if(count == K){
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}