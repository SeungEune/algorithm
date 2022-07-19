//그룹 단어 체커
//문제
//        그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다. 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
//
//        단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
//
//        입력
//        첫째 줄에 단어의 개수 N이 들어온다. N은 100보다 작거나 같은 자연수이다. 둘째 줄부터 N개의 줄에 단어가 들어온다. 단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.
//
//        출력
//        첫째 줄에 그룹 단어의 개수를 출력한다.
//
//        예제 입력 1
//        3
//        happy
//        new
//        year
//        예제 출력 1
//        3
//        예제 입력 2
//        4
//        aba
//        abab
//        abcabc
//        a
//        예제 출력 2
//        1
//        예제 입력 3
//        5
//        ab
//        aa
//        aca
//        ba
//        bb
//        예제 출력 3
//        4
//        예제 입력 4
//        2
//        yzyzy
//        zyzyz
//        예제 출력 4
//        0
package StepByStep.Lever_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());

        int cnt = 0;
        for(int i = 0; i < input; i++){

            String str = br.readLine();

            if(check(str)){
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    public static boolean check(String str){
        boolean[] check = new boolean[26];
        int prev = 0;

        for(int i = 0; i < str.length(); i++) {
            int now = str.charAt(i);

            if (prev != now) {
                if (!check[now - 'a']) {
                    check[now - 'a'] = true;
                    prev = now;
                }
                else {
                    return false;
                }
            }
        }
        return true;
    }
}
