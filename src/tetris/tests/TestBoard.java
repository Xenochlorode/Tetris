package tetris.tests;

import tetris.lib.boards.Board;

public class TestBoard {
    public static void main(String[] args) {
        Board b = new Board(10, 10);
        System.out.println("ORIGINAL \n" + b);
        for (int i = 0; i < 100; i++) {
            b.moveLeft();
        }
        b.moveLeft();
        System.out.println("Left \n" + b);
        for (int i = 0; i < 100; i++) {
            b.moveRight();
        }
        System.out.println("Right \n" + b);
        b.fallDown();
        System.out.println("FALL \n" + b);
        b.freezePiece();
        b.generateRandomPiece();
        System.out.println("Random \n" + b);
        b.moveDown();
        b.rotatate();
        System.out.println("Rotate \n" + b);
    }
}
