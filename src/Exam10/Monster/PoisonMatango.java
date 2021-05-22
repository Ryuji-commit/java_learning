package Exam10.Monster;

import Exam10.Hero.*;

public class PoisonMatango extends Matango {
    int poisonAttackNum = 5;

    public PoisonMatango(char suffix) {
        super(suffix);
    }

    public void attack(Hero h) {
        super.attack(h);
        if (this.poisonAttackNum <= 0) {
            return;
        }
        System.out.println("さらに毒の胞子をばらまいた！");
        int heroDamage = h.hp / 5;
        h.hp -= heroDamage;
        System.out.println(heroDamage + "のダメージ！");
        this.poisonAttackNum -= 1;
    }
}
