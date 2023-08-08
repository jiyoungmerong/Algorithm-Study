package hw8_1;
import java.io.*;
import java.util.*;
public class hw3 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        String[] w = s.split(" "); // 공백으로 분리해서 배열에 저장
        String longstring = "";

        for(String word : w) {
            if(word.length() > longstring.length()){ // 현재 단어가 저장되었던 기존 단어보다 길면 새롭게 추가
                longstring = word;
            }
        }
        System.out.println(longstring);
    }
}
