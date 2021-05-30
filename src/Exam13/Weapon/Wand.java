package Exam13.Weapon;

public class Wand extends Weapon {
    private int recovPower;

    public Wand(String name, int atk, int mtk, int recovPower) {
        super(name, atk, mtk);
        this.setRecovPower(recovPower);
    }

    public int getRecovPower() {return this.recovPower;}
    public void setRecovPower(int recovPower) {
        if (recovPower < 0.5 || recovPower > 100) {
            throw new IllegalArgumentException("増幅率が不適です");
        }
        this.recovPower = recovPower;
    }
}
