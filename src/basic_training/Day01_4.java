package basic_training;

import java.util.Scanner;

public class Day01_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 🍒특정 위치 문자 변경하는 법
        // 문자열은 변경할 수 없는 클래스이므로 String 객체를 변경할 수 없다.
        //  String은 연산과 같은 과정을 통해 새로운 문자열로 변경될 경우 새로운 스트링 객체로 리턴이 된다 -> 성능저하(연산 할수록 메모리 낭비. 가비지컬렉터의 수거대상) : string + string
        // StringBuilder 클래스를 통해 새로운 객체를 만들지 않고도 자유롭게 문자 변경 -> 연산과 다른점은 문자열을 조합할 때 새로운 string 객체를 생성하지 않아 메모리 누수가 되지 않는다
        // StringBuilder.append(string) / 문자열 생성을 도와주는 클래스. append 함수 이용해 문자열 이어붙일 수 있다.

        String a = "aBcDeFg";
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<a.length(); i++){
            if(Character.isUpperCase(a.charAt(i))) { // isUpperCase() 메서드 : Character 클래스 메서드, 대문자인 경우 true 를 반환, 아닌 경우 false
                sb.append(Character.toLowerCase(a.charAt(i))); 
                    
            } else if(Character.isLowerCase(a.charAt(i))){ // isLowerCase() 메서드 : Character 클래스 메서드, 소문자인 경우 true 를 반환, 아닌 경우 false
                sb.append(Character.toUpperCase(a.charAt(i))); 
            }
        }
        System.out.print(sb.toString());
    }
}

