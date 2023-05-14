package tetris.lib.blocks;

public class BlockMatrix {
    protected Block[][] matrix;

    public BlockMatrix(Block[][] mat) {
        this.matrix = new Block[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                this.matrix[i][j] = mat[i][j].getClone();
            }
        }
    }
    public BlockMatrix() {
        this(new Block[][]{{new Empty()}});
    }
    public BlockMatrix(BlockMatrix blockMat) {
        this.matrix = blockMat.matrix;
    }

    public Block[][] getMatrix() {
        return matrix;
    }
    public int getLines() {
        return matrix.length;
    }
    public int getColumns() {
        return matrix[0].length;
    }

    public void rotateMatrix() {
        Block[][] aux = new Block[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                aux[j][matrix.length - i - 1] = matrix[i][j].getClone();
            }
        }
        matrix = aux;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Block[] blocks : this.matrix) {
            for (Block block : blocks) {
                sb.append(block.getTxt()).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public BlockMatrix getClone() {
        return new BlockMatrix(this);
    }
}
