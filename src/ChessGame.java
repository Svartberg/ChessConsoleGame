import chess.ChessStartGame;

import java.util.Scanner;
//import chess.*;

public class ChessGame {
    public static void main(String[] args) {
        Scanner cmd = new Scanner(System.in);
        String text = cmd.nextLine().trim().toLowerCase();
        ChessStartGame startGame = new ChessStartGame(text);

        System.out.println(text);

        //String map = "     a    b    c   d    e    f    g   h  \n   ╔═════════════════════════════════════╗\n 8 ║ ♜ | ♞ | ♝ | ♛ | ♚ | ♝ | ♞ | ♜ ║ 8\n 7 ║\n 6 ║\n 5 ║\n 4 ║\n 3 ║\n 2 ║\n 1 ║\n   ╚═══════════════════════════════╝\n";

    }
}
