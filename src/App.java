public class App {
    public static void main(String[] args) throws Exception {
        RockScissorsPaper game = new RockScissorsPaper();
        game.get_player_input();
        game.decide_final_cpu_hand();
        game.print_result();
    }
}
