package ch04.practice;

public class C02SwitchExpression {
    public static void main(String[] args) {
        String grade = "B";

        int score1 = switch (grade) {
            case "A" -> 100;
            case "B" -> {
                int result = 100 - 20;
                yield result;
            }
            default -> 60;
        };
    }
}
