package Exam13.Weapon;

public class Weapon {
    private String name;
    private int atk;
    private int mtk;
    private int nowDurable;
    private int maxDurable;

    public String getName() {return this.name;}
    public int getAtk() {return this.atk;}
    public int getMtk() {return this.mtk;}
    public int getNowDurable() {return this.nowDurable;}
    public int getMaxDurable() {return this.maxDurable;}

    public void setName(String name) {this.name = name;}
    public void setAtk(int atk) {this.atk = atk;}
    public void setMtk(int mtk) {this.mtk = mtk;}
}
