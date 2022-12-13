package practice.ch07;

public class ch07_15 {
    public static void main(String[] args) {

    }
}

abstract class Unit {
    int x, y;

    abstract void move(int x,int y);

    void stop() {

    }
}

class Marine extends Unit{ // 보병

    void move(int x, int y) { /* */ }


    void stimPack() { /* .*/}
}
class Tank extends Unit{ // 탱크

    void move(int x, int y) { /* */ }


    void changeMode() { /* . */}
}
class Dropship extends Unit{ // 수송선

    void move(int x, int y) { /* */ }


    void load() { /* .*/ }

    void unload() { /* .*/ }
}
