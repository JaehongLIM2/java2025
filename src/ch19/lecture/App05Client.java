package ch19.lecture;

import java.io.*;
import java.net.Socket;

public class App05Client {
    public static void main(String[] args) throws Exception {
        String file = "C:/Temp/download.jpg";
        Socket socket = new Socket("192.168.0.101", 9876);

        try (socket) {
            // client : server 에 연결 시도

            InputStream is = socket.getInputStream();
            BufferedInputStream bis = new BufferedInputStream(is);
            // is 로 파일 받기

            FileOutputStream fos = new FileOutputStream(file);
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            try (bos; fos; bis; is){

                byte[] data = new byte[1024];
                int len = 0;

                while ((len = bis.read(data)) != -1) {
                    bos.write(data, 0, len);
                }
                bos.flush();
            }

        }
    }
}
