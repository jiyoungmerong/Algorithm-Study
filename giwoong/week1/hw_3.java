package src.algorithmstudy.week1;

/*
3. 문장 속 단어

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hw_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        System.out.println(solution(str));
    }

    public static String solution(String str) {
        String[] splitStr = str.split(" ");

        int maxLength = 0;
        String maxLengthStr = "";
        for (String s : splitStr) {
            if (maxLength < s.length()) {
                maxLengthStr = s;
            }
        }

        return maxLengthStr;
    }
}