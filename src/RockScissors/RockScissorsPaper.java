package RockScissors;
import java.util.*;

enum Hands {
    Rock(0),
    Scissors(1),
    Paper(2);

    private final int hand_code;

    private Hands(int code) {
        this.hand_code = code;
    }

    public int get_hand_code() {
        return this.hand_code;
    }
}
public class RockScissorsPaper {
    final double win_rate = 0.2;
    double now_rate = 1.0;
    int player_hand;
    int cpu_hand;

    public void get_player_input() {
        System.out.println("出す手を選択してください");
        System.out.println(Hands.Rock.get_hand_code() + ":" + Hands.Rock.name());
        System.out.println(Hands.Scissors.get_hand_code() + ":" + Hands.Scissors.name());
        System.out.println(Hands.Paper.get_hand_code() + ":" + Hands.Paper.name());

        int input_value;
        Scanner scanner = new Scanner(System.in);
        try {
            while(true) {
                input_value = scanner.nextInt();
                if(is_within_range(input_value)) {
                    this.player_hand = input_value;
                    break;
                }else {
                    System.out.println("Input value from 0 to 2");
                }
            }         
        } catch (Exception e) {
            System.out.println("UnKnown Error");
            scanner.close();
            this.get_player_input();
        }
        scanner.close();
    }

    public boolean is_within_range(int selected_hand) {
        if (selected_hand >= 0 && selected_hand <= 2) {
            return true;
        }
        return false;
    } 

    public void decide_final_cpu_hand() {
        int temporary_cpu_hand = 0;
        while(this.now_rate >= this.win_rate) {
            temporary_cpu_hand = new Random().nextInt(3);
            if (!is_player_win(this.player_hand, temporary_cpu_hand)) {
                break;
            }
            this.now_rate *= win_rate;
        }
        if (is_within_range(temporary_cpu_hand)) {
            this.cpu_hand = temporary_cpu_hand;
        }else {
            System.out.println("CPU hand must be change");
            this.decide_final_cpu_hand();
        }
    }

    public boolean is_player_win(int player_hand, int cpu_hand) {
        if (cpu_hand == 0 && player_hand == 2) {
            return true;
        }

        if (cpu_hand == player_hand + 1) {
            return true;
        }

        return false;
    }

    public void print_result() {
        System.out.println("player :" + this.player_hand);
        System.out.println("CPU :" + this.cpu_hand);
        if (is_player_win(this.player_hand, this.cpu_hand)) {
            System.out.println("You Win!! 俺の負け");
        }else {
            System.out.println("You Lose!! 俺の勝ち。何で負けたか明日までに考えといてください");
        }
    }
}
