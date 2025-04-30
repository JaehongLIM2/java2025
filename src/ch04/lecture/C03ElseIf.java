package ch04.lecture;

public class C03ElseIf {
    public static void main(String[] args) {

        // else if : 이전 조건들이 false 일 때
        //           조건을 확인해서 true 이면 실행되는 블럭


        if (false) {
            System.out.println("코드1");
        } else if (false) {
            System.out.println("코드2");
        } else if (false) {
            System.out.println("코드3");
        } else if (true) {
            System.out.println("코드4");
        } else { // 마지막 else 는 위의 조건들이 모두 false 일 때 실행
            System.out.println("코드 5");
        }
    }
}
