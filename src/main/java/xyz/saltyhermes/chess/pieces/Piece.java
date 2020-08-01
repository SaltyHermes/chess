package xyz.saltyhermes.chess.pieces;
import xyz.saltyhermes.chess.board.Board;
import xyz.saltyhermes.chess.board.BoardUtils;

import java.util.HashSet;


public abstract class Piece {

    protected int coord;
    protected final char color;
    protected char pieceVisual;
    protected char whiteVisual;
    protected char blackVisual;
    protected char pieceType;
    protected int pieceValue;
    protected Board board;
    protected BoardUtils utils;


    protected Piece(char color, int coord, Board board) {
        color = colorize(color);
        this.color = color;
        this.coord = coord;
        this.board = board;
        this.utils = board.getUtils();
    }

    public boolean isMovePseudolegal(int destination) {
        if (isMoveOutOfRange(destination)) {
            return false;
        } else {
            if (isPieceFriendly(destination)) {
                return false;
            } else { 
                return true;
            }
        }
    }

    public abstract HashSet<Integer> getLegalCoords();

    
    public boolean isMoveOutOfRange(int destination) {
        if (destination > board.getGameBoard().size() - 1 || 
            destination < 0 || utils.isTileRestricted(destination)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isPieceFriendly(int destination) {
        if (board.getPiece(destination) != null) {
            if (board.getPiece(destination).getColor() == this.color) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
            
    }

    public boolean isPieceHostile(int destination) {
        if (board.getPiece(destination) != null) {
            if (board.getPiece(destination).getColor() != this.color) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
            
    }


    public char getColor() {
        return color;
    }

    public char getPieceVisual() {
        return pieceVisual;
    }

    public char getPieceType() {
        return pieceType;
    }

    public int getPieceValue() {
        return pieceValue;
    }

    public int getCoord() {
        return coord;
    }

    public void setCoord(int coord) {
        this.coord = coord;
    }

    protected void setPieceVisual() {
        switch(this.color) {
            case 'W':
                this.pieceVisual = whiteVisual;
                break;
            case 'B':
                this.pieceVisual = blackVisual;
                break;
        }
    }

    protected void setWhiteVisual(char whiteVisual) {
        this.whiteVisual = whiteVisual;
    }

    protected void setBlackVisual(char blackVisual) {
        this.blackVisual = blackVisual;
    }

    protected void setPieceType(char pieceType) {
        this.pieceType = pieceType;
    }

    protected void setPieceValue(int pieceValue) {
        this.pieceValue = pieceValue;
    }

    private char colorize(char color) {
        color = Character.toUpperCase(color);
        switch(color) {
            case 'W':
                return color;
            case 'B':
                return color;
            default:
                throw new RuntimeException("Color can only be set to 'W' or 'B'");
        }
    }
}