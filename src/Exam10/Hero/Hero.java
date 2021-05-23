package Exam10.Hero;

import Exam10.Monster.*;

public class Hero extends Character {
    int atk;

    public Hero(String name, int hp, int atk) {
        super(name, hp);
        this.atk = atk;
    }

    public void attack(Matango m) {
        System.out.println(this.name + "の攻撃！");
        m.hp -= this.atk;
        System.out.println(this.atk + "ポイントのダメージを与えた！");
    }
}
