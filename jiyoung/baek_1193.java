package BoJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek_1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine()); // 찾고 싶은 분수의 순서
        int line = 0; // 현재 탐색 중인 라인
        int count = 0; // 현재 라인까지 분수 개수

        while(count < X) { // 현재 라인까지의 분수 개수가 찾고싶은 분수 순서보다 작을 때까지
            line++;
            count = line * (line + 1) / 2;
        }

        if(line % 2 != 0) { // 라인이 홀수일 경우
            int top = 1 + (count - X);
            int bottom = line - (count - X);
            System.out.println(top + "/" + bottom);
        }

        else { // 짝수일 경우
            int top = line - (count - X);
            int bottom = 1 + (count - X);
            System.out.println(top + "/" + bottom);
        }
    }
}