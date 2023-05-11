package tetris.lib.pieces;

import tetris.lib.blocks.Block;
import tetris.lib.blocks.BlockMatrix;

public class Piece extends BlockMatrix {
    private int x;
    private int y;

    public Piece(Block[][] mat, int x, int y) {
        super(mat);
        this.x = x;
        this.y = y;
    }
    public Piece(Piece p) {
        this(p.matrix, p.x, p.y);
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    public Piece getClone() {
        return new Piece(this);
    }

    public void moveLeft() {
        x--;
    }
    public void moveRight() {
        x++;
    }
    public void moveDown() {
        y++;
    }

    public String toString() {
        return "(" + x + "," + y + ")\n" + super.toString();
    }
}
