package xyz.saltyhermes.chess.board;

import java.util.List;
import xyz.saltyhermes.chess.pieces.PieceFactory;

public class Board {

    private List<Tile> gameBoard = new List<Tile>();
    private PieceFactory factory = new PieceFactory();

    public Board() {
        createBoard();
        populateBoard();
    }

    public void createBoard() {
        for (int i = 0; i < 64; i++) {
            gameBoard.add(new Tile());
        }
    }

    public void populateBoard() {

    }

    public void spawnPiece(int coord, byte type) {
        
        gameBoard.get(coord).spawnPiece(piece);
    }

    public List<Tile> getGameBoard() {
        return gameBoard;
    }

    public Tile getTile(int id) {
        return gameBoard.get(id);
    }

}