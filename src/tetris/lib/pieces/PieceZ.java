package tetris.lib.pieces;

import tetris.lib.blocks.Block;
import tetris.lib.blocks.Empty;

public class PieceZ extends Piece {
    public PieceZ() {
        super(new Block[][]{
                {new Block('Z'), new Block('Z'), new Empty()},
                {new Empty(), new Block('Z'), new Block('Z')}
                },0,0);
    }
}
