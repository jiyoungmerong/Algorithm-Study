package fourweek;
import java.io.*;
import java.util.*;
public class B3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] no1 = br.readLine().split(" ");
        String[] no2 = br.readLine().split(" ");
        String[] no3 = br.readLine().split(" ");

        String x;
        String y;

        if(no1[0].equals(no2[0])){ //1번과 2번 x좌표 비교
            x = no3[0];
        }
        else if (no1[0].equals(no3[0])) { // 1번과 3번 x좌표 비교
            x = no2[0];
        }
        else { // 2번과 3번 x좌표 비교
            x = no1[0];
        }

        if (no1[1].equals(no2[1])) { // 1번과 2번 y좌표 비교
            y = no3[1];
        }
        else if (no1[1].equals(no3[1])) { // 1번과 3번 y좌표 비교
            y = no2[1];
        }
        else { // 2번과 3번 y좌표 비교
            y = no1[1];
        }

        System.out.println(x + " " + y);
    }
}
