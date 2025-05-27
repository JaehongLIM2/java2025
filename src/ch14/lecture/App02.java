package ch14.lecture;

import java.awt.*;

public class App02 {
    public static void main(String[] args) throws InterruptedException {
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        for (int i = 0; i < 5; i++) {
            toolkit.beep();

            Thread.sleep(1000);
        }

    }
}
