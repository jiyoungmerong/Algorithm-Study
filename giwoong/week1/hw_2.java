package src.algorithmstudy.week1;

/*
2. 대소문자 변환

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hw_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        System.out.println(solution(str));
    }

    public static String solution(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char strChar = str.charAt(i);

            if (strChar >= 'a' && strChar <= 'z') {
                sb.append(Character.toUpperCase(strChar));
            } else {
                sb.append(Character.toLowerCase(strChar));
            }
        }

        return sb.toString();
    }
}
