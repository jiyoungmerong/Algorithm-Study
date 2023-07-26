package trdweek;
import java.io.*;
public class B2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        int c = 1; //겹 값
        int range = 2; // 범위 길이값

        if(num == 1){
            System.out.print(1);
        }
        else{
            while(range <= num){
                range = range + (c * 6); // 한 겹씩 밖으로 빠질때마다 6칸씩 증가하는 원리에 따라서
                c++;
            }
            System.out.print(c);
        }
    }
}
