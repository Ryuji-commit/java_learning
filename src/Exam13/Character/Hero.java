package Exam13.Character;

public class Hero extends Character{
    public Hero(String name, int hp, int mp) {
        super(name, hp, mp);
    }

    public void attack() {
        System.out.println("Hero " + this.getName() + "の攻撃！\n" + this.getWeapon().getAtk() + "のダメージ");
    }

    public void run() {
        System.out.println("Hero" + this.getName() + "は逃げ出した！");
    }
}
