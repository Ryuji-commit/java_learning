package Exam9;

public class Thief {
    String name;
    int hp;
    int mp;

    public Thief(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    public Thief(String name, int hp) {
        this(name, hp, 5);
    }

    public Thief(String name) {
        this(name, 45);
    }

    public void printName() {
        System.out.print(this.name);
    }

    public void printStates() {
        System.out.println("HP: " + this.hp);
        System.out.println("MP: " + this.mp);
    }
}
