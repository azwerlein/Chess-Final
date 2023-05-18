package chess.display;

import chess.ChessBoard;
import chess.objects.King;
import chess.objects.Pawn;
import chess.objects.Piece;

public class CmdLineDisplay implements Display {
    public void render(ChessBoard board) {
        Piece[][] grid = board.getGrid();
        for (int y = grid.length - 1; y >= 0; y++) {
            for (int x = 0; x < grid[0].length; x++) {
                if (grid[y][x] == null) {
                    System.out.print(" ");
                } else if (grid[y][x] instanceof Pawn) {
                    System.out.print("P");
                } else if (grid[y][x] instanceof King) {
                    System.out.print("K");
                }
            }
            System.out.println();
        }
    }
}
