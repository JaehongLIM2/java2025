package ch18.exercise.p07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Example {
    public static void main(String[] args) throws IOException {
        String filePath = "src/ch18/exercise/p07/Example.java";
        FileReader fr = new FileReader(filePath);
        BufferedReader br = new BufferedReader(fr);

        int rowNumber = 0;
        String rowData;
        while (true) {
            rowData = br.readLine();
            if (rowData == null) break;
            System.out.println(rowNumber + " : " + rowData);
            rowNumber++;

        }
        br.close();
        fr.close();
    }
}
