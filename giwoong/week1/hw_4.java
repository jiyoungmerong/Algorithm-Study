package src.algorithmstudy.week1;

/*
4. 단어 뒤집기

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hw_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            System.out.println(solution(str));
        }
    }

    public static String solution(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
