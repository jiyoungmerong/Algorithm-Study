package src.algorithmstudy.week1;

/*
1. 문자 찾기

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hw_1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char alpha = br.readLine().charAt(0);

        System.out.println(solution(str, alpha));
    }

    public static int solution(String str, char alpha) {
        int answer = 0;
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char strChar = str.charAt(i);

            if (strChar == alpha) {
                answer++;
            }
        }

        return answer;
    }
}
