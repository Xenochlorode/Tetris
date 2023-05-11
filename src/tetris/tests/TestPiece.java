package tetris.tests;

import tetris.lib.blocks.Block;
import tetris.lib.blocks.Empty;
import tetris.lib.pieces.Piece;

public class TestPiece {
    public static void main(String[] args) {
        Block[][] B = {
                {new Empty(), new Block('S'), new Block('S')},
                {new Block('S'), new Block('S'), new Empty()}
        };
        Piece p = new Piece(B, 1, 4);
        System.out.println("piece = " + p);
        p.moveRight();
        p.rotate();
        System.out.println("Right and rotate " + p);
    }
}
