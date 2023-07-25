package BoJ;

/*

정수 N이 주어졌을 때, 소인수분해하는 프로그램을 작성
 */

import java.io.*;

public class baek_11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        int i = 2;

        while (n != 1) {
            if (n % i == 0) { // i가 n의 약수이면 나누고 출력
                n/= i;
                sb.append(i + "\n");
            }
            else
                i++;
        }
        System.out.print(sb);
    }
}