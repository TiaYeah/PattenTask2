public interface Matrix {
    int getRows();

    int getCols();

    int getValue(int row, int col);

    void setValue(int row, int col, int value);
}
