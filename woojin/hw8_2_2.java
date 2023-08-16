package hw8_2;
import java.io.*;
public class hw8_2_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String st = br.readLine();
        st =  st.toLowerCase(); // 대소문자 상관없이 비교를 위한

        StringBuilder alpa = new StringBuilder(); // 알파벳 문자만을 저장할 StringBuilder

        for(int i=0; i < st.length(); i++){
            char c = st.charAt(i);
            if(Character.isLetter(c)){ // 알파벳 문자인 경우에만 저장
                alpa.append(c);
            }
        }

        boolean pd = true; // 팰린드롬 여부를 저장 변수

        int left = 0;
        int right = alpa.length() - 1; // 오른쪽 인덱스

        while (left < right) { //문자열에서 양방향에서 중간지점으로 이동하며 문자 비교
            if(alpa.charAt(left) != alpa.charAt(right)){
                pd = false;
                break;
            }
            left++;
            right--;
        }
        if(pd){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
    }
}
// 1번 문제랑 거의 똑같은 수준에서 몇 개 더 수정하거나 추가하는 식으로 풀었습니다
// 마찬가지로 시간복잡도가 높아보여서 좀 더 연마해야겠습니다..