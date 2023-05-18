package test;

import chess.ChessBoard;
import chess.objects.King;
import chess.objects.Pawn;
import chess.objects.Piece;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChessBoardTest {

    ChessBoard chessBoard;

    @BeforeAll
    void setUp() {
        this.chessBoard = new ChessBoard();
    }

    @Test
    void setupGrid() {
        assertNotNull(chessBoard.getGrid());
        assertTrue(checkStartingPositions(chessBoard));
    }

    private boolean checkStartingPositions(ChessBoard chessBoard) {
        Piece[][] grid = chessBoard.getGrid();
        for (int i = 0; i < grid[0].length; i++) {
            if (!(grid[1][i] instanceof Pawn && grid[6][i] instanceof Pawn)) {
                return false;
            }
        }

        if (!(grid[4][0] instanceof King && grid[4][7] instanceof King)) {
            return false;
        }

        return true;
    }

    @Test
    void getGrid() {

    }
}