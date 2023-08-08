package hw8_1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hw1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        s = s.toLowerCase(); // 소문자로 변환 (메소드는 구글링했어요)

        char c = br.readLine().charAt(0);
        c = Character.toLowerCase(c); // 소문자로 변환

        int count = 0;

        // 문자열 돌면서 해당 문자 개수 체크
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }

        System.out.println(count); //chul力
    }
}
