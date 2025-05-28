package ch18.sec03.exam03;

import java.io.*;

public class CopyExample {
    public static void main(String[] args) throws IOException {
        String origin = "C:/Temp/test.jpg";
        String target = "C:/Temp/test2.jpg";

        InputStream is = new FileInputStream(origin);
        OutputStream os = new FileOutputStream(target);

        try (is; os;) {

            byte[] data = new byte[1024];
            while (true) {
                int num = is.read(data);
                if (num == -1) {
                    break;
                }

                os.write(data, 0, num);
            }

            os.flush();
        }
    }
}