package ch06.sec14;

public class Car {
    private int speed;
    private boolean stop;


    // 단축키 alt + Insert

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed < 0) {
            this.speed = 0;
        } else {
            this.speed = speed;
        }

    }

    // boolean type getter 는 is 로 시작
    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
        if (stop == true) {
            this.speed = 0;
        }
    }
}
