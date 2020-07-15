package xyz.saltyhermes.chess.board;

import java.util.ArrayList;
import java.util.List;
import xyz.saltyhermes.chess.pieces.*;

public class Board {
    
    private static final char[] pieceLayout = { 'R', 'N', 'B', 'Q', 'K', 'B', 'N', 'R',
                                                'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P',
                                                ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
                                                ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
                                                ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
                                                ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
                                                'p', 'p', 'p', 'p', 'p', 'p', 'p', 'p',
                                                'r', 'n', 'b', 'q', 'k', 'b', 'n', 'r'};

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
        char pieceType;
        for (int i = 0; i < 64; i++) {
            pieceType = pieceLayout[i];
            spawnPiece(i, pieceType);
        }
    }

    public void spawnPiece(char color, int coord, char type) {
        Piece piece = factory.createPiece(color, coord, type);
        gameBoard.get(coord).spawnPiece(piece);
    }

    public void spawnPiece(int coord, char type) {
        Piece piece = factory.createPiece(coord, type);
        gameBoard.get(coord).spawnPiece(piece);
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