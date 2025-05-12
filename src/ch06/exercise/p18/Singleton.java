package ch06.exercise.p18;

public class Singleton {

}

class ShopService {
    static ShopService instance = new ShopService();

    private ShopService() {

    }

    public static ShopService getInstance() {
        return instance;
    }


}
