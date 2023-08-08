package hw8_1;
import java.io.*;
public class hw2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < s.length(); i++){ // 문자열 순회
            char c = s.charAt(i);

            if(Character.isUpperCase(c)){ // 대문자인 경우 소문자로 변환
                result.append(Character.toLowerCase(c)); //result에 추가
            } else if(Character.isLowerCase(c)){ // 반대로 소문자인 경우 대문자로 변환
                result.append(Character.toUpperCase(c)); //result에 추가
            }

        }
        System.out.println(result.toString()); // 결과 출력
    }
}
