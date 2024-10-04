import java.util.Arrays;

public class OrdinaryMatrix extends AbstractMatrix{
    private OrdinaryVector[] rows;

    public OrdinaryMatrix(int rowCount, int colCount) {
        super(rowCount, colCount);
        rows = new OrdinaryVector[rowCount];
        for( int i = 0; i < rowCount; i++) {
            rows[i] = new OrdinaryVector(colCount);
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
        return "OrdinaryMatrix{" +
                "rows=" + Arrays.toString(rows) +
                '}';
    }
}
