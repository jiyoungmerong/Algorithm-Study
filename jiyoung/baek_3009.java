package BoJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek_3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = 0, y = 0;

        for (int i = 0; i < 3; ++i) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            /*
            x와 y에 연속으로 XOR 연산 수행.
            (비트)두 숫자를 비교하여 같으면 0, 다르면 1을 반환하는 연산임!
            5 5
            2 2
            3 3 을 예시로 들면,
            x = 5 ^ 2 ^ 3 = 4
            y = 5 ^ 2 ^ 3 = 4
            고로 답이 4 4 가 됨...

            */
            x ^= Integer.parseInt(tokenizer.nextToken());
            y ^= Integer.parseInt(tokenizer.nextToken());
        }
        System.out.printf("%d %d\n", x, y);
    }
}
