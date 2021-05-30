package Exam13.Character;

import Exam13.Weapon.*;

public class Wizard extends Character{
    public Wizard(String name, int hp, int mp) {
        super(name, hp, mp);
    }

    public void heal(Character character) {
        Wand wand;
        int recovPoint;
        int basePoint = 10;
        try {
            wand = (Wand)this.getWeapon();
            recovPoint = (int)(basePoint * wand.getRecovPower());
        } catch (Exception e) {
            System.out.println(this.getName() + "は杖を装備していません！");
            return;
        }
        character.setHp(character.getHp() + recovPoint);
        System.out.println(character.getName() + "のHPを" + recovPoint + "回復した！");
    }

    public void attack() {
        System.out.println("Wizard " + this.getName() + "の攻撃！");
    }

    public void run() {
        System.out.println("Wizard " + this.getName() + "は逃げ出した！");
    }
}
