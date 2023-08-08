package BoJ;

/*
한 개의 문자열을 입력받고, 특정 문자를 입력받아
해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램
 */
import java.util.*;
class hw_1 {
    public static int solution(String str, char t) {
        int answer = 0;
        str = str.toUpperCase();
        t=Character.toUpperCase(t);


        for(char c : str.toCharArray()) {
            if(c==t)
                answer++;
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char c = scanner.next().charAt(0);

        System.out.println(solution(str, c));
    }
}