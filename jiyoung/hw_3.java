package BoJ;

/*
한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력
 */
import java.util.Scanner;

class hw_3 {
    public static String solution(String str) {
        String answer = "";
        String[] arr = str.split(" ");
        int max = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i].length() > max) {
                max = arr[i].length();
                answer = arr[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(hw_3.solution(str));

    }
}
