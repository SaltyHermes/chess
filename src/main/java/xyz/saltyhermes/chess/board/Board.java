package xyz.saltyhermes.chess.board;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

import xyz.saltyhermes.chess.pieces.*;

public class Board implements Cloneable {
    
    private static final Character[] pieceLayout = { 'R', 'N', 'B', 'Q', 'K', 'B', 'N', 'R',
                                                        'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P',
                                                        ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
                                                        ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
                                                        ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
                                                        ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
                                                        'p', 'p', 'p', 'p', 'p', 'p', 'p', 'p',
                                                        'r', 'n', 'b', 'q', 'k', 'b', 'n', 'r'};

    private List<Character> layoutList = Arrays.asList(pieceLayout);
    private ListIterator<Character> layoutIterator = layoutList.listIterator();
        
    

    private List<Tile> gameBoard = new ArrayList();
    private PieceFactory factory = new PieceFactory();
    private BoardUtils utils = new BoardUtils(this);

    public Board() {
        createBoard();
        populateBoard();
    }

    public void createBoard() {
        for (int i = 0; i < 119; i++) {
            Tile tile = new Tile(i);
            gameBoard.add(tile);
        }
    }

    public void populateBoard() {
        char pieceType;
        for (int i = 0; i < 120; i++) {
            if (!utils.isTileRestricted(i)) {
                pieceType = layoutIterator.next();
                spawnPiece(i, pieceType);
            }
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

    public BoardUtils getUtils() {
        return utils;
    }

}