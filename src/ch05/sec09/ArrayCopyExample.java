package ch05.sec09;

public class ArrayCopyExample {
    public static void main(String[] args) {
        // 배열을 복사하는 방법
        // 1. for 문을 이용
        // 2. Arrays.copyOf()
        // 3. System.arraycopy


        String[] oldStrArray = {"java", "array", "copy"};
        String[] newStrArray = new String[5];

        System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
        for (int i = 0; i < newStrArray.length; i++) {
            System.out.print(newStrArray[i] + ", ");
        }
    }
}
