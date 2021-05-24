package Exam13.Character;

import Exam13.Weapon.*;

public class Wizard extends Character{
    private Wand wand;

    public Wizard(String name, int hp, int mp) {
        super(name, hp, mp);
    }

    public void setWeapon(Wand wand) {
        this.wand = wand;
    }

    public void heal(Character character) {
        int basePoint = 10;
        int recovPoint = (int)(basePoint * this.wand.getRecovPower());
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
