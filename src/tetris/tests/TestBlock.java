package tetris.tests;

import tetris.lib.blocks.Block;

public class TestBlock {
    public static void main(String[] args) {
//        construtor com parametros
        Block b1 = new Block('L');
//        construtor cópia
        Block b2 = new Block(b1);
//        clonar um objeto
        Block b3 = b2.getClone();
        System.out.println("Construtores e clone");
//        toString
        System.out.println("b1 = " + b1 + "\tb2 = " + b2 + "\tb3 = " + b3);
//        modificador
        b2.setTxt('X');
        System.out.println("Modificador b2");
        System.out.println("b1 = " + b1 + "\tb2 = " + b2 + "\tb3 = " + b3);
    }
}
