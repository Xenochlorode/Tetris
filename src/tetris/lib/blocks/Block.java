package tetris.lib.blocks;

public class Block {
    private char txt;

    public Block(char text) {
        this.txt = text;
    }
    public Block(Block block) {
        this.txt = block.txt;
    }

    public void setTxt(char text) {
        this.txt = text;
    }
    public char getTxt() {
        return txt;
    }

    public String toString() {
        return String.valueOf(txt);
    }

    public Block getClone() {
        return new Block(this);
    }
}