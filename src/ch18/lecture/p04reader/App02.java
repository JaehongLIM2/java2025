package ch18.lecture.p04reader;

import java.io.*;

public class App02 {
    public static void main(String[] args) throws IOException {

        // reader 연습용 파일 만들기
        String fileName = "C:/Temp/reader02.txt";
        try (Writer writer = new FileWriter(fileName)) {
            writer.write('a');
            writer.write('한');
            writer.write('글');
            writer.write("날");
            writer.write("🧢");
            writer.flush();
        }

        // reader 연습
        try (Reader reader = new FileReader(fileName)) {
            char[] data = new char[10];
            int length = reader.read(data);

            System.out.println("length = " + length);
        }

    }
}
