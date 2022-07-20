//숫자의 합
//입력
//        첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
//
//        출력
//        입력으로 주어진 숫자 N개의 합을 출력한다.
//
//        예제 입력 1
//        1
//        1
//        예제 출력 1
//        1
//        예제 입력 2
//        5
//        54321
//        예제 출력 2
//        15
//        예제 입력 3
//        25
//        7000000000000000000000000
//        예제 출력 3
//        7
//        예제 입력 4
//        11
//        10987654321
//        예제 출력 4
//        46
package StepByStep.Level_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java_11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());

        String inputSumData = br.readLine();

        int sum = 0;
        for (int i = 0; i < input; i++) {
            sum += Integer.parseInt(String.valueOf(inputSumData.charAt(i)));
        }

        System.out.println(sum);
    }
}
