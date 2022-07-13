//한수
//문제
//        어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.
//
//        입력
//        첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.
//
//        출력
//        첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.
//
//        예제 입력 1
//        110
//        예제 출력 1
//        99
//        예제 입력 2
//        1
//        예제 출력 2
//        1
//        예제 입력 3
//        210
//        예제 출력 3
//        105
//        예제 입력 4
//        1000
//        예제 출력 4
//        144
//        예제 입력 5
//        500
//        예제 출력 5
//        119
package StepByStep.Level_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 풀면서 느낀점 : 이건 실패;; 못풀었다...
 */
public class Java_1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(d(Integer.parseInt(br.readLine())));
    }

    public static int d(int input){
        int cnt = 0;

        if(input < 100){
            cnt = input;
        } else {
            cnt = 99;

            for(int i = 100; i <= input; i++){
                int a = i / 100;//100자릿수
                int b = (i / 10) % 10;//10자릿수
                int c = i % 10;//1자릿수

                if((a - b) == (b - c)){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
