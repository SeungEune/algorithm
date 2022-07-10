//X보다 작은 수
//  문제
//  정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
//
//  입력
//  첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
//
//  둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.
//
//  출력
//  X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나 존재한다.
//
//  예제 입력 1
//  10 5
//  1 10 4 9 2 3 8 5 7 6
//  예제 출력 1
//  1 4 2 3

package StepByStep.Level_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 풀면서 느낀 점 : 나는 C#을 좀 더 많이 했기 때문에 C#의 Linq에 더 익숙하다....(List<int> result = A.Where(w -> w < x).ToList();)
 *              Java의 stream은 더 공부가 필요하다...
 *              그리고 백준에는 stream을 사용을 못하는건가??? 자바 11인데???
 *              또 다른 사람 소스를 보니 내가 너무 쓸데 없는 코드를 많이 짜는건가 싶다...
 *              굳이 split을 이용해서 배열로 만들어야했나...
 */
public class Java_10871 {

    public static void main(String[] args) throws IOException {
//-----------------------------컴파일 에러 발생-----------------
//----------------??? 백준에서는 Stream을 쓸수 없는건가... ???-----------------
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer str = new StringTokenizer(br.readLine(), " ");
//
//        int N = Integer.parseInt(str.nextToken());
//        int X = Integer.parseInt(str.nextToken());
//
//        StringTokenizer strA = new StringTokenizer(br.readLine(), "");
//        String[] A = strA.nextToken().split(" ");
//
//        List<String> strings = Arrays.stream(A).filter(f -> Integer.parseInt(f) < X).toList();
//
//        StringBuilder sb = new StringBuilder();
//
//        for (String m : strings) {
//            sb.append(m + " ");
//        }
//
//        System.out.println(sb);
//-----------------------------컴파일 에러 발생-----------------


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(str.nextToken());
        int X = Integer.parseInt(str.nextToken());

        StringTokenizer strA = new StringTokenizer(br.readLine(), "");
        String[] A = strA.nextToken().split(" ");

        br.close();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {

            int intA = Integer.parseInt(A[i]);

            if(X > intA){
                sb.append(intA + " ");
            }
        }
        System.out.println(sb);


//-----------------다른 사람 소스----------------
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//
//        int N = Integer.parseInt(st.nextToken());
//        int X = Integer.parseInt(st.nextToken());
//
//        StringBuilder sb = new StringBuilder();
//
//        st = new StringTokenizer(br.readLine(), " ");
//
//        for (int i = 0; i < N; i++) {
//            int value = Integer.parseInt(st.nextToken());
//
//            if (value < X)
//                sb.append(value).append(' ');
//        }
//        System.out.println(sb);
    }

}
