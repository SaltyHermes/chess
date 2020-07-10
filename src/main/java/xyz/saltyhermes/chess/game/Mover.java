package xyz.saltyhermes.chess.game;
import java.util.List;
import xyz.saltyhermes.chess.board.*;

public class Mover {

    private char ownerColor;

    public Mover(char ownerColor) {
        this.ownerColor = ownerColor;
    }

    public boolean isLegal(List<Tile> board, int start, int destination) {

        return false;
    }

    public void doMove() {

    }
}