package ch15.lecture.p04stack;

import java.util.Stack;

public class App01 {
    public static void main(String[] args) {
        // stack(LIFO : Last In First Out)
        // 마지막에 들어간 객체가 먼저 나온다.

        Stack<String> stack = new Stack<>();
        // push : 추가
        stack.push("java");
        stack.push("spring");
        stack.push("react");
        stack.push("java"); // 중복 가능
        stack.push("css");
        System.out.println(stack);
        System.out.println("-------");

        // pop : 꺼내기
        String e1 = stack.pop();
        System.out.println("e1 = " + e1);
        String e2 = stack.pop();
        System.out.println("e2 = " + e2);
        System.out.println(stack);
        System.out.println("-------");

        // peek : 가장 위(가장 마지막 추가)에 있는 객체 보기
        String p1 = stack.peek();
        System.out.println("p1 = " + p1);
        System.out.println(stack);

    }
}
