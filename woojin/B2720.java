package study;
import java.util.*;
public class B2720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        while (x != 0) {
            int[] mArray = new int[x];
            for (int i = 0; i < x; i++) {
                mArray[i] = sc.nextInt();
            }
            for (int i = 0; i < x; i++) {
                int money = mArray[i];

                int a = (int)money / 25;
                int b = (int)(money - a * 25) / 10;
                int c = (int)(money - a * 25 - b * 10) / 5;
                int d = money - a * 25 - b * 10 - c * 5;

                System.out.println(a + " " + b + " " + c + " " + d);
            }
        }
    }
}
