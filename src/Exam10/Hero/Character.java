package Exam10.Hero;

public abstract class Character implements Human {
    String name;
    public int hp;

    public Character(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public void run() {
        System.out.println(this.name + "は逃げ出した！");
    }

    public abstract void attack(Exam10.Monster.Matango m);
}
