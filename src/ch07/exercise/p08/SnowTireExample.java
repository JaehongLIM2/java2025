package ch07.exercise.p08;

public class SnowTireExample {
    public static void main(String[] args) {
        SnowTire snowtire = new SnowTire();
        Tire tire = snowtire;

        snowtire.run();
        tire.run();
    }
}
