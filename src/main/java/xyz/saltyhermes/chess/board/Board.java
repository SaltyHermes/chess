package xyz.saltyhermes.chess.board;

import java.util.ArrayList;
import java.util.List;
import xyz.saltyhermes.chess.pieces.*;

public class Board implements Cloneable {
    
    private static final char[] pieceLayout = { 'R', 'N', 'B', 'Q', 'K', 'B', 'N', 'R',
                                                ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
                                                ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
                                                ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
                                                ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
                                                ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
                                                ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
                                                'r', 'n', 'b', 'q', 'k', 'b', 'n', 'r'};

    private List<Tile> gameBoard = new ArrayList();
    private PieceFactory factory = new PieceFactory();
    private BoardUtils utils = new BoardUtils(this);

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
        char pieceType;
        for (int i = 0; i < 64; i++) {
            pieceType = pieceLayout[i];
            spawnPiece(i, pieceType);
        }
    }

    public void spawnPiece(char color, int coord, char type) {
        Piece piece = factory.createPiece(color, coord, type, this);
        gameBoard.get(coord).putPiece(piece);
    }

    public void spawnPiece(int coord, char type) {
        Piece piece = factory.createPiece(coord, type, this);
        gameBoard.get(coord).putPiece(piece);
    }

    public Piece getPiece(int coord) {
        Piece piece = gameBoard.get(coord).getPiece();
        return piece;
    }

    public List<Tile> getGameBoard() {
        return gameBoard;
    }

    public Tile getTile(int id) {
        return gameBoard.get(id);
    }

}