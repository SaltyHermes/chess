package xyz.saltyhermes.chess.game;
import xyz.saltyhermes.chess.board.*;
import xyz.saltyhermes.chess.pieces.Piece;

public class Mover {

    private char ownerColor;
    private Board board;

    public Mover(Board board, char ownerColor) {
        this.ownerColor = ownerColor;
        this.board = board;
    }

    

    public void doMove(int start, int destination) {
        if (board.getPiece(start).getLegalCoords().contains(destination)) {
            Piece piece = board.getPiece(start);
            board.getTile(destination).spawnPiece(piece);
            board.getTile(destination).updatePieceCoord();
            board.getTile(start).removePiece();

        }
    }
}