package tetris.lib.pieces;

import tetris.lib.blocks.Block;
import tetris.lib.blocks.Empty;

public class PieceT extends Piece {
    public PieceT() {
        super(new Block[][]{
                {new Block('T'), new Block('T'), new Block('T')},
                        {new Empty(), new Block('T'), new Empty()}
                },0,0);
    }
}
