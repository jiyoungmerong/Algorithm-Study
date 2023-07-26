package trdweek;
import java.io.*;
import java.util.*;
public class B2501 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //입력받은 값 토크나이저로 쪼개서 변수에 int형으로 저장
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        for(int i = 1; i <= a; i++){
            if(a % i == 0){
                b--;
            }
            if(b == 0){ //b번째 약수면 i 출력
                System.out.println(i);
                return;
            }
        }
        System.out.println(0); // b번쨰 약수 없으면 0 출력
    }
}
