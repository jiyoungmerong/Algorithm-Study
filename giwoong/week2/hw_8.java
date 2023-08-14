package src.algorithmstudy.week2;

/*
8. 유효한 팰린드롬
 정규식을 사용해 특수문자는 ""으로 변경
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hw_8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        System.out.println(solution(str));
    }

    public static String solution(String str) {
        String strLowerCase = str.replaceAll("[^a-zA-Z]", "").toLowerCase();

        for (int i = 0; i < strLowerCase.length() / 2; i++) {
            if (strLowerCase.charAt(i) != strLowerCase.charAt(strLowerCase.length() - i - 1)) {
                return "NO";
            }
        }

        return "YES";
    }
}
