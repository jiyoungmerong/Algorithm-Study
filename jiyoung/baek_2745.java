package BoJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
B진법 수 N => 10진수
N이 대문자면 55를 빼주고, 숫자면 0을 빼주고 제곱수
 */

public class baek_2745 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        String N = st.nextToken(); // 수
        StringBuilder sb = new StringBuilder(N);
        N = sb.reverse().toString(); // 낮은 자수부터 처리하기 위해
        int B = Integer.parseInt(st.nextToken()); // 진법
        int answer;
        int sum = 0;

        for(int i = 0; i<N.length(); i++){
            if(N.charAt(i) >= 'A' && N.charAt(i) <= 'Z') // 알파벳일 때
                answer = N.charAt(i) - 55;
            else
                answer = N.charAt(i) - '0';
            sum += (answer + Math.pow(B, i)); // N의 각 자릿수를 10진법으로 변하여 더해줌
        }

        System.out.println(sum); // 10진법으로 변환된 값 출력

        /*
        간단하게 하는 법!!
        StringTokenizer로 N, B 토큰 받아주고 (nextToken()사용)
        Integer.parseInt(N, B) 해주면 B진법 N을 10진법으로 바꿀 수 있음!!

        반대로 Integer.toString(N, B)을 해주면
        10진법 N을 B진법으로 바꿀 수 있다!!
        */
    }
}