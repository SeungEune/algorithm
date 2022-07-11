//OX퀴즈
//문제
//        "OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 예를 들어, 10번 문제의 점수는 3이 된다.
//
//        "OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
//
//        OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.
//
//        입력
//        첫째 줄에 테스트 케이스의 개수가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 길이가 0보다 크고 80보다 작은 문자열이 주어진다. 문자열은 O와 X만으로 이루어져 있다.
//
//        출력
//        각 테스트 케이스마다 점수를 출력한다.
//
//        예제 입력 1
//        5
//        OOXXOXXOOO
//        OOXXOOXXOO
//        OXOXOXOXOXOXOX
//        OOOOOOOOOO
//        OOOOXOOOOXOOOOX
//        예제 출력 1
//        10
//        9
//        7
//        55
//        30
package StepByStep.Level_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 풀면서 느낀점 : char vs String... '' vs "" 이걸 알았다면
 *              굳이 String a = String.valueOf(sc.charAt(j)); <- 이걸 안해도 됐을탠데...
 */
public class Java_8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cnt; i++) {
            String sc = br.readLine();

            int totalSum = 0;
            int sum = 0;
            for (int j = 0; j < sc.length(); j++) {
                String a = String.valueOf(sc.charAt(j));

                if("O".equals(a)){
                    sum++;
                } else {
                    sum = 0;
                }
                totalSum = totalSum + sum;
            }
            sb.append(totalSum + "\n");
        }

        System.out.println(sb);



        //---다른 사람 소스
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        StringBuilder sb = new StringBuilder();
//
//        int test_case = Integer.parseInt(br.readLine()); // 테스트 케이스
//
//        for (int i = 0; i < test_case; i++) {
//
//            int cnt = 0; // 연속횟수
//            int sum = 0; // 누적 합산
//
//            for (byte value : br.readLine().getBytes()) {
//
//                if (value == 'O') {
//                    cnt++;
//                    sum += cnt;
//                }
//                else {
//                    cnt = 0;
//                }
//            }
//
//            sb.append(sum).append('\n');
//
//        }
//        System.out.println(sb);
    }
}
