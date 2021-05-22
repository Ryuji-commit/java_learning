package Exam10.Hero;

import Exam10.Monster.*;

public class Hero {
    String name;
    public int hp;

    public Hero(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public void attack(Matango m) {
        System.out.println(this.name + "の攻撃！");
        m.hp -= 5;
        System.out.println("5ポイントのダメージを与えた！");
    }

    public void run() {
        System.out.println(this.name + "は逃げ出した！");
    }
}
