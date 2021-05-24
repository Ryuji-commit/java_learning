package Exam13.Weapon;

public class Wand extends Weapon {
    private int recovPower;

    public Wand(String name, int atk, int mtk, int recovPower) {
        this.setName(name);
        this.setAtk(atk);
        this.setMtk(mtk);
        this.recovPower = recovPower;
    }

    public int getRecovPower() {return this.recovPower;}
    public void setRecovPower(int recovPower) {this.recovPower = recovPower;}
}
