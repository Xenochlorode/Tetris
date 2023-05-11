package tetris.lib.pieces;

import tetris.lib.blocks.Block;

public class PieceO extends Piece {
    public PieceO() {
        super(new Block[][]{
                {new Block('O'), new Block('O')},
                        {new Block('O'), new Block('O')}
                },0,0);
    }
}
