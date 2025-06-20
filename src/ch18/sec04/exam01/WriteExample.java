package ch18.sec04.exam01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {
    public static void main(String[] args) {
        try {
            try (Writer writer = new FileWriter("C:/Temp/test.txt")) {

                char a = 'A';
                writer.write(a);

                char b = 'B';
                writer.write(b);

                char[] arr = {'C', 'D', 'E'};
                writer.write(arr);

                writer.write("FGH");

                writer.flush();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}