package BoJ;

import java.io.IOException;
import java.util.Scanner;
/*
n이 완전수인지 아닌지 판단하는 프로그램 작성.
n이 자신을 제외한 모든 약수의 합과 같으면 완전수라고 함.

 */
public class baek_9506 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        while(true){
            StringBuilder sb = new StringBuilder();
            int n = scanner.nextInt();
            int sum = 0;

            if(n == -1)
                break;

            for(int i = 1; i<n; i++){
                if(n%i == 0){
                    sb.append(i + " + "); // 약수 저장
                    sum += i;
                }
            }

            // 완전수인지 아닌지 판단하고 결과 출력
            System.out.println(n == sum ? n + " = " + sb.substring(0, sb.length()-3) : n + " is NOT perfect.");
        }
    }
}