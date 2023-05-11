package tetris.lib.pieces;

import tetris.lib.blocks.Block;
import tetris.lib.blocks.Empty;

public class PieceS extends Piece {
    public PieceS() {
        super(new Block[][]{
                {new Empty(), new Block('S'), new Block('S')},
                        {new Block('S'), new Block('S'), new Empty()}
                },0,0);
    }
}
