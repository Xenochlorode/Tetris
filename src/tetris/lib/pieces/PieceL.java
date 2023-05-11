package tetris.lib.pieces;

import tetris.lib.blocks.Block;
import tetris.lib.blocks.Empty;

public class PieceL extends Piece {
    public PieceL() {
        super(new Block[][]{
                {new Block('L'), new Empty()},
                        {new Block('L'), new Empty()},
                        {new Block('L'), new Block('L')}
                },0,0);
    }
}
