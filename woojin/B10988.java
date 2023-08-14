package fiveweek;
import java.io.*;
import java.util.*;

public class B10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuilder sb = new StringBuilder(s);

        if (s.equals(sb.reverse().toString())) { // Stringbuilder에 reverse메소드를 사용해서 비교
            System.out.println("1");
        } else {
            System.out.println("0");
        }

    }
}
