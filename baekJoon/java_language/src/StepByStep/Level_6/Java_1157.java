//단어 공부
//문제
//        알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
//
//        입력
//        첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
//
//        출력
//        첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
//
//        예제 입력 1
//        Mississipi
//        예제 출력 1
//        ?
//        예제 입력 2
//        zZa
//        예제 출력 2
//        Z
//        예제 입력 3
//        z
//        예제 출력 3
//        Z
//        예제 입력 4
//        baaa
//        예제 출력 4
//        A
package StepByStep.Level_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int[] alphabet = new int[26];

        for(int i = 0; i < input.length(); i++){
            if ('a' <= input.charAt(i) && input.charAt(i) <= 'z') {
                alphabet[input.charAt(i) - 97]++;
            } else {
                alphabet[input.charAt(i) - 65]++;
            }
        }

        int max = -1;
        char sc = '?';
        for (int i = 0; i < 26; i++) {

            if (alphabet[i] > max) {
                max = alphabet[i];
                sc = (char) (i + 65);
            }
            else if (alphabet[i] == max) {
                sc = '?';
            }
        }

        System.out.print(sc);
    }
}