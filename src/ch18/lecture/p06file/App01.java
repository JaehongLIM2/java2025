package ch18.lecture.p06file;

import java.io.File;

public class App01 {
    public static void main(String[] args) {
        // File : file 정보를 담고 있는 객체
        File f1 = new File("C:/Temp/nothing.txt");
        File f2 = new File("C:/Temp/bear.jpg");

        // exists
        boolean exists = f1.exists();
        System.out.println("exists = " + exists);
        boolean exists1 = f2.exists();
        System.out.println("exists1 = " + exists1);

        // getName
        String name = f2.getName();
        System.out.println("name = " + name);

        // getPath
        String path = f2.getPath();
        System.out.println("path = " + path);

        // length
        long length = f2.length();
        System.out.println("length = " + length);

        // isDirectory
        boolean directory = f2.isDirectory();
        System.out.println("directory = " + directory);

        //isFile
        boolean file = f2.isFile();
        System.out.println("file = " + file);

    }
}
