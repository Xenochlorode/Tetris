package tetris.tests;

import tetris.lib.blocks.Block;
import tetris.lib.blocks.BlockMatrix;
import tetris.lib.blocks.Empty;

public class TestBlockMatrix {
    public static void main(String[] args) {
        Block[][] bl = {
                {new Block('L'), new Empty()},
                {new Block('L'), new Empty()},
                {new Block('L'), new Block('L')},};
        BlockMatrix b1 = new BlockMatrix(bl);
        BlockMatrix b2 = b1.getClone();
        BlockMatrix b3 = new BlockMatrix();

        System.out.println("b1\n" + b1);
        System.out.println("b2\n" + b2);
        System.out.println("b3\n" + b3);

        System.out.println("N. Linhas: " + b1.getLines());
        System.out.println("N. colunas: " + b1.getColumns());

        b2.rotateMatrix();
        System.out.println("Original b1\n" + b1);
        System.out.println("Rotate b2\n" + b2);
    }

}
