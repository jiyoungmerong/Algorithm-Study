package trdweek;
import java.util.*;
public class B5086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){

            int first = sc.nextInt();
            int second = sc.nextInt();

            if(first == 0 && second == 0)
                break;
            if(second % first == 0){
                System.out.println("factor");
            }
            else if (first % second == 0) {
                System.out.println("multiple");
            }
            else
                System.out.println("neither");
        }
        // 너무 쉽게 풀어서 딱히 주석이 없어도 이해가능 하실거라고 생각함미다..
    }
}
