package BoJ;

/*
N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램
 */
import java.util.Scanner;
import java.lang.StringBuilder;
class hw_4{

    public static String solution(String str) {

        StringBuilder sb = new StringBuilder(str);
        String answer = sb.reverse().toString();

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        for(int i = 0; i<num; i++) {
            String str = scanner.next();
            System.out.println(solution(str));
        }

    }

}