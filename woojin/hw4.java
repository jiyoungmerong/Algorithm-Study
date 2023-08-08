package hw8_1;
import java.io.*;
import java.util.*;
public class hw4 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int wnum = Integer.parseInt(br.readLine()); // 단어 개수

        String[] w = new String[wnum]; // 입력된 단어를 배열에 저장

        for(int i =0; i < wnum; i++){
            w[i] = br.readLine(); // 단어 개수만큼 단어 입력
        }
        for(int i=0; i < wnum; i++){
            //StringBuilder에 reverse메소드를 사용해서 문자 앞 뒤 순서 바꾸기
            StringBuilder reverseword = new StringBuilder(w[i]).reverse();
            System.out.println(reverseword); // 출력
        }
    }
}
