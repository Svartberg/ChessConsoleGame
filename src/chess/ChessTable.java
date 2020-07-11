package chess;

public class ChessTable {
    public void drawBoard(){
        StringBuilder board;
    }
}

class chessTableInit {
    final int X = 8;
    final int Y = 8;

    private int[][] chessPlayerOneObject = {{1,1,1,1,1,1,1,1,2,2,3,3,4,4,5,6},{2,2,2,2,2,2,2,2,1,1,1,1,1,1,1,1},{1,2,3,4,5,6,7,8,1,8,2,7,3,6,4,5}};
    private int[][] chessPlayerTwoObject = {{11,11,11,11,11,11,11,11,12,12,13,13,14,14,15,16},{2,2,2,2,2,2,2,2,1,1,1,1,1,1,1,1},{1,2,3,4,5,6,7,8,1,8,2,7,3,6,5,4}};


    void board() {
        String[][] mapDraw = new String[X][Y];
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
                case 0: mapDraw[chessPlayerOneObject[1][objectX]][chessPlayerOneObject[2][objectX]] = " ";
                break;
                }
            }
            System.out.println();
        }
    }




    /*
    white chess king	16 ♔	U+2654	&#9812;	&#x2654;
    white chess queen	15 ♕	U+2655	&#9813;	&#x2655;
    white chess rook	12 ♖	U+2656	&#9814;	&#x2656;
    white chess bishop	14 ♗	U+2657	&#9815;	&#x2657;
    white chess knight	13 ♘	U+2658	&#9816;	&#x2658;
    white chess pawn	11 ♙	U+2659	&#9817;	&#x2659;
    black chess king	6 ♚	U+265A	&#9818;	&#x265A;
    black chess queen	5 ♛	U+265B	&#9819;	&#x265B;
    black chess rook	2 ♜	U+265C	&#9820;	&#x265C;
    black chess bishop	4 ♝	U+265D	&#9821;	&#x265D;
    black chess knight	3 ♞	U+265E	&#9822;	&#x265E;
    black chess pawn	1 ♟︎	U+265F	&#9823;	&#x265F;
    */
//Создание тела шахмотной доски

//Распределение шахмат по доске

//Отрисовка шахматной доски



/*
   a   b   c   d   e   f   g   h
 |===============================|
8| ' + chessDrawPosition[0][0] + ' | ' + chessDrawPosition[0][1] + ' | ' + chessDrawPosition[0][2] + ' | ' + chessDrawPosition[0][3] + ' | 'p' | 'p' | 'p' | 'p' |8
7| ' + chessDrawPosition[1][0] + ' | ' + chessDrawPosition[1][1] + ' | 'p' | 'p' | 'p' | 'p' | 'p' | 'p' |7
6| '_' | '_' | '_' | '_' | '_' | '_' | '_' | '_' |6
5| _ | _ | _ | _ | _ | _ | _ | _ |5
4| _ | _ | _ | _ | _ | _ | _ | _ |4
3| _ | _ | _ | _ | _ | _ | _ | _ |3
2| p | p | p | p | p | p | p | p |2
1| p | p | p | p | p | p | p | p |1
 |===============================|
   a   b   c   d   e   f   g   h
 */










