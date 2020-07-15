package xyz.saltyhermes.chess.game;
import xyz.saltyhermes.chess.board.*;

public class Mover {

    private char ownerColor;
    private Board board;

    public Mover(Board board, char ownerColor) {
        this.ownerColor = ownerColor;
        this.board = board;
    }

    public boolean isLegal(int start, int destination) {
        return isMoveInRange(start, destination);
    }

    public boolean isMoveInRange(int start, int destination) {
        int boardrange = board.getGameBoard().size() - 1;
        if (start < 0 || start > boardrange || destination < 0 || destination > boardrange) {
            return false;
        } else {
            return true;
        }
    }

    public void doMove(int start, int destination) {
        if (isLegal(start, destination)) {
        }
    }
}