//import chess.*;

public class ChessGame {
    public static void main(String[] args) {
        String map = "     a    b    c   d    e    f    g   h  \n   ╔═════════════════════════════════════╗\n 8 ║ ♜ | ♞ | ♝ | ♛ | ♚ | ♝ | ♞ | ♜ ║ 8\n 7 ║\n 6 ║\n 5 ║\n 4 ║\n 3 ║\n 2 ║\n 1 ║\n   ╚═══════════════════════════════╝\n";
        chessGameTest chess = new chessGameTest();

        chess.board();

    }
}

class chessGameTest{
    int[][] chessPlayerOneObject = {{1,0,1,1,1,1,1,1,2,2,3,3,4,4,5,6},{2,2,2,2,2,2,2,2,1,1,1,1,1,1,1,1},{1,2,3,4,5,6,7,8,1,8,2,7,3,6,4,5}};
    public void board(){
        String[][] mapDraw = new String[9][9];
        for (int objectX = 0; objectX < 16; objectX++) {
            switch (chessPlayerOneObject[0][objectX]){
                case 1: mapDraw[chessPlayerOneObject[1][objectX]][chessPlayerOneObject[2][objectX]] = "♟";
                    break;
                case 2: mapDraw[chessPlayerOneObject[1][objectX]][chessPlayerOneObject[2][objectX]] = "♜";
                    break;
                case 3: mapDraw[chessPlayerOneObject[1][objectX]][chessPlayerOneObject[2][objectX]] = "♞";
                    break;
                case 4: mapDraw[chessPlayerOneObject[1][objectX]][chessPlayerOneObject[2][objectX]] = "♝";
                    break;
                case 5: mapDraw[chessPlayerOneObject[1][objectX]][chessPlayerOneObject[2][objectX]] = "♛";
                    break;
                case 6: mapDraw[chessPlayerOneObject[1][objectX]][chessPlayerOneObject[2][objectX]] = "♚";
                    break;
                case 11: mapDraw[chessPlayerOneObject[1][objectX]][chessPlayerOneObject[2][objectX]] = "♙";
                    break;
                case 12: mapDraw[chessPlayerOneObject[1][objectX]][chessPlayerOneObject[2][objectX]] = "♖";
                    break;
                case 13: mapDraw[chessPlayerOneObject[1][objectX]][chessPlayerOneObject[2][objectX]] = "♘";
                    break;
                case 14: mapDraw[chessPlayerOneObject[1][objectX]][chessPlayerOneObject[2][objectX]] = "♗";
                    break;
                case 15: mapDraw[chessPlayerOneObject[1][objectX]][chessPlayerOneObject[2][objectX]] = "♕";
                    break;
                case 16: mapDraw[chessPlayerOneObject[1][objectX]][chessPlayerOneObject[2][objectX]] = "♔";
                    break;
                case 0: mapDraw[chessPlayerOneObject[1][objectX]][chessPlayerOneObject[2][objectX]] = "-";
                    break;
            }
        }
        System.out.println(mapDraw[2][1]);
    }

}
