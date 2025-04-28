package ch02.lecture;

public class C11String {
    public static void main(String[] args) {
        String a;
        a = "javascript 는 java 와 다르다.";
        System.out.println("a = " + a);

        a = "동해물과 백두산이 \n" +
                "마르고 닳도록 \n" +
                "하느님이 보우하사 \n" +
                "우리 나라 만세";
        System.out.println("a = " + a);

        // String block : 여러 줄 작성할 대 유용
        // """ ... 내용 ... """
        // 가장 왼쪽의 들여쓰기 기준
        // """가 시작되는 첫줄은 다음 줄로 작성 시작


        a = """
                  동해물과 백두산이
                      마르고 닳도록
                      하느님이 보우하사
                      우리 나라 만세
                """;
        System.out.println("a = " + a);

    }
}
