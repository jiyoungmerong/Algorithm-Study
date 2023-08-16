package hw8_2;
import java.io.*;
public class hw8_2_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));

        String st = br.readLine();
        st = st.toLowerCase(); // 대소문자 구분 없이 비교

        boolean pd =  true; // 팰린드롬 여부 저장 변수

        int left = 0;
        int right = st.length() - 1;

        while(left < right){ //문자열에서 양방향에서 중간지점으로 이동하며 문자 비교
            if(st.charAt(left) != st.charAt(right)){
                pd = false;
                break;
            }
            left++;
            right--;
        }
        if(pd){ // 출력
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
    }
}
// 코드가 그리 깔끔하지 않은점.. 더 간단하게 할 수 있을 거 같은데 좀 더 해봐야할 거 같은 느낌입니다.