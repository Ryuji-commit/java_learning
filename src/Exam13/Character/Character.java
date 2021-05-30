package Exam13.Character;

import Exam13.Weapon.*;

public abstract class Character implements Human {
    private int hp;
    private int mp;
    private String name;
    private Weapon weapon;

    public Character(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    public int getHp() {return this.hp;}
    public int getMp() {return this.mp;}
    public String getName() {return this.name;}
    public Weapon getWeapon() {return this.weapon;}

    public void setHp(int hp) {
        if (hp < 0) {
            hp = 0;
        }
        this.hp = hp;
    }
    public void setMp(int mp) {
        if (mp < 0) {
            throw new IllegalArgumentException("mpフィールドに不正な値をセットしようとしています");
        }
        this.mp = mp;
    }
    public void setName(String name) {this.name = name;}
    public void setWeapon(Weapon weapon) {this.weapon = weapon;}

    public abstract void attack();
}
