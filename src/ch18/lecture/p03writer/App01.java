package ch18.lecture.p03writer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class App01 {
    public static void main(String[] args) throws IOException {
        try (OutputStream os = new FileOutputStream("C:/Temp/writer01.txt")) {
            os.write(97); // a
            os.write(100); // d
            os.write(103); // g
            os.write(33); // !

            os.write('t'); // good

            os.flush();
        }
    }
}