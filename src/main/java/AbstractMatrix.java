public abstract class AbstractMatrix implements Matrix {
    protected int rowCount;
    protected int colCount;

    public AbstractMatrix(int rowCount, int colCount) {
        this.rowCount = rowCount;
        this.colCount = colCount;
    }

    @Override
    public int getRows() {
        return rowCount;
    }

    @Override
    public int getCols() {
        return colCount;
    }
}