//별 찍기 - 2
//  문제
//  첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
//
//  하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
//
//  입력
//  첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
//
//  출력
//  첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
//
//  예제 입력 1
//  5
//  예제 출력 1
//  *
//  **
//  ***
//  ****
//  *****


//이때 나의 생각 : Java는 기본적으로 String Object에 padLeft 등의 메서드가 지원이 안되는거 보고 놀랐다...
//              기존에 내가 사용하는거는 apache에서 지원을 하는거였구나... (org.apache.commons.lang.StringUtils.padding.leftPad)
//              또한, 그냥 for, for 두번 돌리는게 더 심플한가??? 라는 의문이 든다... 아마 알고리즘에선 더 나을 지도?? 현업과는 다르게??

package StepByStep.Level_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java_2439 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());

        for (int i = 0; i < input; i++) {
            StringBuilder sb = new StringBuilder();
            //공백을 채워 넣음
            int parma = input - (i + 1);

            //채워 넣을 공백이 0이면 필요 없다.
            if(parma > 0){
                sb.append(padLeft(parma));
            }

            for (int j = 0; j < i + 1; j++) {
                sb.append("*");
            }

            System.out.println(sb);
        }
    }

    private static String padLeft(int padCnt){
        return String.format("%" + padCnt + "s", "");
    }
}
