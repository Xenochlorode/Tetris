package tetris.tests;

import tetris.lib.blocks.Block;
import tetris.lib.blocks.Empty;

public class TestEmpty {
    public static void main(String[] args) {
        //construtor
        Empty e = new Empty();
        //to string
        System.out.println("e = " + e);
        //clone
        Block e2 = e.getClone();
        System.out.println("e2 = "+ e2.getClass());

    }
}
