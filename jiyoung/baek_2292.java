package BoJ;
/*
중앙 1부터 시작해서 이웃하는 방에 돌아가며 1씩 증가할 때,
벌집 중앙 1에서 N번 방까지 최소 개수의 방을 지나갈 때 몇 개의 방을 지나가는지
*/
import java.util.*;
public class baek_2292 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 1;
        int hexagon = 0; // 현재의 육각형
        int totalhexagon = 1; // 전체 육각형

        while(true) {
            if(n<=totalhexagon)
                break;
            else {
                hexagon += 6;
                totalhexagon += hexagon;
                count++;
            }
        }
        System.out.println(count);
    }
}