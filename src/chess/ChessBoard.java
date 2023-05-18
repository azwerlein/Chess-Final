package chess;

import chess.objects.King;
import chess.objects.Pawn;
import chess.objects.Piece;

public class ChessBoard {
    private final Piece[][] grid;

    public ChessBoard() {
        this.grid = this.setupChessBoard();
    }

    private Piece[][] setupChessBoard() {
        Piece[][] grid = new Piece[8][8];
        grid[0][4] = new King(Team.WHITE);
        grid[7][4] = new King(Team.BLACK);
        for (int i = 0; i < grid[0].length; i++) {
            grid[1][i] = new Pawn(Team.WHITE);
            grid[6][i] = new Pawn(Team.BLACK);
        }
        return grid;
    }

    public Piece[][] getGrid() {
        return this.grid;
    }
}
