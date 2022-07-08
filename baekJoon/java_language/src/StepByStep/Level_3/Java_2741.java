//N 찍기
//  문제
//  자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
//
//  입력
//  첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.
//
//  출력
//  첫째 줄부터 N번째 줄 까지 차례대로 출력한다.
//
//  예제 입력 1
//  5
//  예제 출력 1
//  1
//  2
//  3
//  4
//  5

package StepByStep.Level_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java_2741 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());

        for(int i = 0; i < input; i++){
            System.out.println(i + 1);
        }
    }
}
