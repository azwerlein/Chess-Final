package chess;

public class ChessGame {
    private final ChessBoard chessBoard;
    private int turnCount;
    private Team activeColor = Team.WHITE;

    private final Player playerOne;
    private final Player playerTwo;

    public ChessGame() {
        this.chessBoard = new ChessBoard();
        this.playerOne = new Player(Team.WHITE);
        this.playerTwo = new Player(Team.BLACK);
    }

    public void takeTurn() {
        
    }
}
