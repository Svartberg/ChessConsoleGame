package chess;

public class ChessStartGame {
    protected int[][] chessPlayerOneObject = new int[3][16];
    protected int[][] chessPlayerTwoObject = new int[3][16];
    chessTable draw = new chessTable();

    public ChessStartGame() { }
    public ChessStartGame(String text) {
        switch (text) {
            case "start": chessPlayerOneObject = new int[][]{{1,1,1,1,1,1,1,1,2,2,3,3,4,4,5,6},{2,2,2,2,2,2,2,2,1,1,1,1,1,1,1,1},{1,2,3,4,5,6,7,8,1,8,2,7,3,6,4,5}};
                          chessPlayerTwoObject = new int[][]{{11,11,11,11,11,11,11,11,12,12,13,13,14,14,15,16},{2,2,2,2,2,2,2,2,1,1,1,1,1,1,1,1},{1,2,3,4,5,6,7,8,1,8,2,7,3,6,5,4}};
                          break;
            case "end":   break;
            case "Draw":  draw.chessTableInt();
                          break;
            case "Score":
            case "":
        }
    }
}

class chessTable {
    final int X = 8;
    final int Y = 8;

    private String[][] mapDraw = new String[X][Y];
    ChessStartGame pl = new ChessStartGame();

    public void chessTableInt() {
        int drawX;
        int drawY;
        for (drawY = 0; drawY < Y; drawY++) {
            for (drawX = 0; drawX < X; drawX++) {
                mapDraw[drawX][drawY] = "[ ]";
            }
            drawX = 0;
        }
        for (int objectX = 0; objectX < 16; objectX++) {
            switch (pl.chessPlayerOneObject[0][objectX]){
                case 1: mapDraw[pl.chessPlayerOneObject[1][objectX]][pl.chessPlayerOneObject[2][objectX]] = "[♟]";
                    break;
                case 2: mapDraw[pl.chessPlayerOneObject[1][objectX]][pl.chessPlayerOneObject[2][objectX]] = "[♜]";
                    break;
                case 3: mapDraw[pl.chessPlayerOneObject[1][objectX]][pl.chessPlayerOneObject[2][objectX]] = "[♞]";
                    break;
                case 4: mapDraw[pl.chessPlayerOneObject[1][objectX]][pl.chessPlayerOneObject[2][objectX]] = "[♝]";
                    break;
                case 5: mapDraw[pl.chessPlayerOneObject[1][objectX]][pl.chessPlayerOneObject[2][objectX]] = "[♛]";
                    break;
                case 6: mapDraw[pl.chessPlayerOneObject[1][objectX]][pl.chessPlayerOneObject[2][objectX]] = "[♚]";
                    break;
                case 11: mapDraw[pl.chessPlayerOneObject[1][objectX]][pl.chessPlayerOneObject[2][objectX]] = "[♙]";
                    break;
                case 12: mapDraw[pl.chessPlayerOneObject[1][objectX]][pl.chessPlayerOneObject[2][objectX]] = "[♖]";
                    break;
                case 13: mapDraw[pl.chessPlayerOneObject[1][objectX]][pl.chessPlayerOneObject[2][objectX]] = "[♘]";
                    break;
                case 14: mapDraw[pl.chessPlayerOneObject[1][objectX]][pl.chessPlayerOneObject[2][objectX]] = "[♗]";
                    break;
                case 15: mapDraw[pl.chessPlayerOneObject[1][objectX]][pl.chessPlayerOneObject[2][objectX]] = "[♕]";
                    break;
                case 16: mapDraw[pl.chessPlayerOneObject[1][objectX]][pl.chessPlayerOneObject[2][objectX]] = "[♔]";
                    break;
                case 0: mapDraw[pl.chessPlayerOneObject[1][objectX]][pl.chessPlayerOneObject[2][objectX]] = "[ ]";
                    break;
            }
        }
        for(drawY = 0; drawY < Y; drawY++) {
            for (drawX = 0; drawX < X; drawX++) {
                System.out.print(mapDraw[drawX][drawY] + " ");
            }
            System.out.println();
            drawX = 0;
        }
    }
}
