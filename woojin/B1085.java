package fourweek;
import java.util.*;
import java.io.*;
public class B1085 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int xmin = Math.min(x, w-x); // x축에서 최소거리 찾기
        int ymin = Math.min(y, h-y); // y축에서 최소거리 찾기

        System.out.println(Math.min(xmin, ymin));

    }
}
