package lv0;

import java.util.Scanner;

/*
영어 알파벳으로 이루어진 문자열 str이 주어집니다. 각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.

입출력 예
입력 #1

aBcDeFg
출력 #1

AbCdEfG
 */
public class Change_uppercase_and_lowercase_07_05 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String text = sc.next();
       String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isLowerCase(ch)) {
                result += Character.toUpperCase(ch);
            }else {
                result += Character.toLowerCase(ch);
            }
        }
        System.out.println(result);
    }
}



































/*
    우선 스캐너 객체를 생성하고
    입력받을 변수에 스캐너 객체를 넣고
    결과를 대입할 변수를 만들고
    for문으로 입력받은 text의 길이만큼 반복하는 반복문안에
    char변수에 text를 char타입으로 변환해 ch에 저장하고
    검사해서 결과 변수에 대입한다
    전위연산 연산후 할당
    후위연산 할당후 연산
*/