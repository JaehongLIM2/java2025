package ch08.sec08;

public class MultiInterfaceImplExample {
    public static void main(String[] args) {
        RemoteControl rc = new SmartTelevision();
        rc.turnOn();
        rc.turnOn();

        Searchable searchable = new SmartTelevision();
        searchable.search("http://www.youtube.com/");
        

    }
}
