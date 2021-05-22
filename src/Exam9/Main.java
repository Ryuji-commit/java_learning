package Exam9;

public class Main {
    // 値渡し(値のみが引数にコピーされる)が行われ、呼出元に影響しない
    public static void heal(int hp) {
        hp += 10;
    }

    // 先頭アドレスが渡されるので、JVMがアドレス解決を行い、実際に値が変わる
    public static void heal(Thief thief) {
        thief.hp += 10;
    }

    public static void main(String[] args) {
        int baseHp = 25;
        Thief t = new Thief("アサカ", baseHp);
        System.out.println(baseHp + ":" + t.hp);
        heal(baseHp);
        heal(t);
        // 25:35と表示されるはず
        // クラス型変数は確保したメモリの先頭アドレスを保持するため
        System.out.println(baseHp + ":" + t.hp);
    }
}
