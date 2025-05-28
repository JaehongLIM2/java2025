package ch18.lecture.p05filter;

import java.io.*;

public class App07 {
    public static void main(String[] args) throws IOException {
        String file = "C:/Temp/filter07.txt";
        try (FileOutputStream os = new FileOutputStream(file)) {
            os.write('a');
            os.write('b');
        }

        // OutputStreamWriter : output stream 을 writer 로 변환
        // PrintStream : Output stream 을 사용해 프린트 하듯
        //                                      출력하는 메소드가 있음

        OutputStream os = new FileOutputStream(file);
        PrintStream ps = new PrintStream(os);

        try (os; ps) {
            ps.println("ab");
            ps.println("xy");
            ps.println("한글");
            ps.println("💕🙌😍");
        }


    }
}
