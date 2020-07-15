package xyz.saltyhermes.chess.pieces;

public class Rook extends Piece {
    
    private int[] potentialMoves = {-17, -15, -10, -8, 8, 10, 15, 17};

    public Rook(char color, int coord) {
        super(color, coord);
        setWhiteVisual('R');
        setBlackVisual('r');
        setPieceVisual();
    }

    @Override
    public void move() {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean isMoveLegal() {
        // TODO Auto-generated method stub
        return false;
    }
}