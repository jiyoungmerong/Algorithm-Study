package trdweek;
import java.io.*;

public class B9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true) {
            int n = Integer.parseInt(br.readLine());

            if (n == -1) {
                break;
            }

            int[] array = new int[n];

            int sum = 0;

            for (int i = 1; i <= n; i++) {
                if (n % i == 0 && i != n) {
                    array[i] = i;
                    sum += i;
                }
                //차피 아니면 0이 들어가서 else문 생략
            }

            //완전수가 아닐 경우
            if (sum != n) {
                sb.append(n+ " is NOT perfect. \n");
                continue; //완전수가 아니기때문에 밑의 코드는 수행안함
            }

            sb.append(n + " = 1"); //1의 약수는 차피 무조건 추가이기 때문에

            for(int i = 1; i <= n; i++){ //index만큼 반복문
                if(array[i-1] != 0 && array[i-1] != 1){ //숫자 출력 부분 1출력은 생략
                    sb.append(" + " + array[i-1]);
                }

            }
            sb.append("\n");

        }
        br.close();
        System.out.println(sb);
    }
}
// 존나게 어려워서 구글링을 참고했습니다.
// 추가로 스트링빌더를 찾아서 한번 써봤는데 아직 이해도가 그리 높지는 않은거 같아서 코드가 길어진 거 같슴다
