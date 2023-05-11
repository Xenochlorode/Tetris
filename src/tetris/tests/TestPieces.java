package tetris.tests;

import tetris.lib.pieces.*;

public class TestPieces {
    public static void main(String[] args) {
        Piece i = new PieceI();
        i.moveRight();
        System.out.println(i);
        Piece j = new PieceJ();
        j.rotate();
        j.moveDown();
        System.out.println(j);
        System.out.println(new PieceL());
        System.out.println(new PieceO());
        System.out.println(new PieceS());
        System.out.println(new PieceT());
        System.out.println(new PieceZ());
    }
}
