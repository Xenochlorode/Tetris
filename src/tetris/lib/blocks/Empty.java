package tetris.lib.blocks;

public class Empty extends Block {

    // Default constructor
    public Empty() {
        super('.');
    }

    // Method to clone the object
    public Block getClone() {
        return new Empty();
    }
}

