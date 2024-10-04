import java.util.Arrays;

public class SparseMatrix extends AbstractMatrix {
    private SparseVector[] rows;

    public SparseMatrix(int rowCount, int colCount) {
        super(rowCount, colCount);
        rows = new SparseVector[rowCount];
        for (int i = 0; i < rowCount; i++) {
            rows[i] = new SparseVector(colCount);
        }
    }

    @Override
    public int getValue(int row, int col) {
        return rows[row].getValue(col);
    }

    @Override
    public void setValue(int row, int col, int value) {
        rows[row].setValue(col, value);
    }

    @Override
    public String toString() {
        return "SparseMatrix{" +
                "rows=" + Arrays.toString(rows) +
                '}';
    }
}
