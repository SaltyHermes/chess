package xyz.saltyhermes.chess.board;

import java.util.ArrayList;
import java.util.List;
import xyz.saltyhermes.chess.pieces.*;

public class Board {

    private List<Tile> gameBoard = new ArrayList();
    private PieceFactory factory = new PieceFactory();

    public Board() {
        createBoard();
        populateBoard();
    }

    public void createBoard() {
        for (int i = 0; i < 64; i++) {
            Tile tile = new Tile(i);
            gameBoard.add(tile);
        }
    }

    public void populateBoard() {

    }

    public void spawnPiece(char color, int coord, char type) {
        Piece piece = factory.createPiece(color, coord, type);
        gameBoard.get(coord).spawnPiece(piece);
    }

    public List<Tile> getGameBoard() {
        return gameBoard;
    }

    public Tile getTile(int id) {
        return gameBoard.get(id);
    }

}