package BoJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*

N개 중 소수가 몇 개인지 찾아서 출력

 */
public class baek_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] str = br.readLine().split(" ");
        int count = 0;

        // 소수인지 판별하기
        for (int i = 0; i < N; i++) {
            int temp = Integer.parseInt(str[i]);
            if(isPrime(temp)) count++; // 소수면 +1
        }
        System.out.println(count);
    }

    public static boolean isPrime(int num){ // 에라토스테네스 체 사용한 소수 판별 메소드
        if(num < 2) return false;
        for(int i = 2; i * i <= num; i++){
            if(num % i == 0) return false;
        }
        return true;
    }
}