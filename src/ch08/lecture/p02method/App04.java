package ch08.lecture.p02method;

public class App04 {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.walk();
        hero.pickWeapon(new Sword());
        hero.attack();
        hero.pickWeapon(new Gun());
        hero.attack();
        hero.pickWeapon(new Bow());
        hero.attack();
    }
}


interface Weapon {
    void use();
}

class Gun implements Weapon {
    @Override
    public void use() {
        System.out.println("방아쇠를 당깁니다.");
    }
}

class Bow implements Weapon {
    @Override
    public void use() {
        System.out.println("활시위를 당깁니다.");
    }
}

class Sword implements Weapon {
    @Override
    public void use() {
        System.out.println("칼을 휘두릅니다");
    }
}

class Hero {
    private Weapon weapon;

    public void walk() {
        System.out.println("걸어갑니다.");
    }

    public void pickWeapon(Weapon weapon) {
        System.out.println("무기를 획득합니다");
        this.weapon = weapon;
    }

    public void attack() {
        System.out.println("공격합니다");
        weapon.use();
    }
}
