package BoJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
10진법 수 N을 B진법으로 바꿔서 출력하기
 */
public class baek_11005 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        // while문으로 푸려고 했지만 2745번을 그렇게 풀었으므로 그냥 이렇게 풀겠음!!!!
        System.out.println(Integer.toString(N, B).toUpperCase());
    }
}