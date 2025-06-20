package ch18.lecture.p06file;

import java.io.*;

public class App02 {
    public static void main(String[] args) throws IOException {
//        // 존재하지 않는 디렉토리를 만드는 방법
//        String d1 = "C:/Temp/some";
//        File f1 = new File(d1);
//        System.out.println(f1.exists());
//
//        if (!f1.exists()) {
//            f1.mkdir(); // 하나의 디렉토리 만들기
//
//        }

        String d2 = "C:/Temp/some/sub";
        File f2 = new File(d2);
        System.out.println(f2.exists());

        if (!f2.exists()) {
            f2.mkdirs(); // mkdirs : 부모 디렉토리도 없으면 부모 디렉토리도 같이 만듬
        }


        String file = "C:/Temp/some/sub/file2.txt";
        FileOutputStream fos = new FileOutputStream(file);
        PrintStream ps = new PrintStream(fos);

        try (ps; fos) {
            ps.println("hello file");
            ps.flush();

        }
    }
}