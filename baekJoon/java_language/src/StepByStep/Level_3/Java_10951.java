//A+B - 4
//  문제
//  두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//
//  입력
//  입력은 여러 개의 테스트 케이스로 이루어져 있다.
//
//  각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
//
//  출력
//  각 테스트 케이스마다 A+B를 출력한다.
//
//  예제 입력 1
//  1 1
//  2 3
//  3 4
//  9 8
//  5 2
//  예제 출력 1
//  2
//  5
//  7
//  17
//  7
package StepByStep.Level_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 풀면서 느낀점 : 엥??? 네 런타임 환경 자바 소스에선 nextTokenizer 오류나는데...???
 *              왜 백준에선 되지;;;;;;;; 머리 아프다;;;
 *              자바 17 쓰고 있길래 맞추려고 11로 바꾸기 까지 했는데... 왜?? 와이??
 *              콘솔 입력을 종료할때 뭔가 다른 방법이 있는건가??;;
 */
public class Java_10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer str;
        StringBuilder sb = new StringBuilder();

        String input;
        while ((input=br.readLine()) != null){

            str = new StringTokenizer(input, " ");
            int a = Integer.parseInt(str.nextToken());
            int b = Integer.parseInt(str.nextToken());

            sb.append((a + b) + "\n");
        }

        System.out.println(sb);
    }
}
