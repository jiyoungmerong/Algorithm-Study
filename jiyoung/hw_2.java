package BoJ;

/*
대문자와 소문자가 같이 존재하는 문자열을 입력받아
대문자 => 소문자 / 소문자 => 대문자 변환하여 출력하는 프로그램
 */
import java.util.Scanner;

class hw_2 {
    public static String solution(String str) {
        String answer = "";
        for(char c : str.toCharArray()){
            if(Character.isUpperCase(c)){
                answer += Character.toLowerCase(c);
            }
            else if(Character.isLowerCase(c)){
                answer += Character.toUpperCase(c);
            }
        }

        return answer;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        System.out.println(solution(str));

    }
}