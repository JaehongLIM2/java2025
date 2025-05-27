package ch18.lecture.p05filter;

import java.io.*;

public class App01 {
    public static void main(String[] args) throws IOException {

        String fileName = "C:/Temp/filter01.txt";
        try (Writer writer = new FileWriter(fileName)) {
            writer.write('a');
            writer.write('한');
            writer.write('글');
            writer.write("날");
            writer.write("🧢");
            writer.flush();
        }

        Reader reader = new FileReader(fileName);

        // Buffered Reader : 문자들을 buffer 에 넣어 놓고 한 번에 읽음

        BufferedReader br = new BufferedReader(reader);

        try (br; reader) {
            int r1 = br.read();
            System.out.println("(char) r1 = " + (char) r1);
            String line = br.readLine();
            System.out.println("line = " + line);
        }
    }
}
