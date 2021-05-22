package Exam9;

public class Ninja extends Thief{
    String weapon;

    public Ninja() {
        super("ninja", 90, 10);
        this.weapon = "手裏剣";
        this.hp += 20;
    }

    public void throwWeapon() {
        super.printName();
        System.out.println("の" + this.weapon + "投げ!");
    }

    public void printStates() {
        super.printStates();
        System.out.println("weapon: " + weapon);
    }
}
