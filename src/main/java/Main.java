public class Main {
    public static void main(String[] args) {
        Vector vector = new SparseVector(5);
        for (int i = 0; i < 5; i++) {
            vector.setValue(i, i);
        }
        vector.setValue(4, 12);
        System.out.println(vector);

        int rowCount = 5;
        int colCount = 5;

        Matrix ordinaryMatrix = new OrdinaryMatrix(rowCount, colCount);
        Matrix sparseMatrix = new SparseMatrix(rowCount, colCount);

        MatrixInitializer.fillMatrix(ordinaryMatrix, 10, 15);
        MatrixInitializer.fillMatrix(sparseMatrix, 10, 15);

        System.out.println(ordinaryMatrix);
        System.out.println(sparseMatrix);

        MatrixStatistics ordinaryStats = new MatrixStatistics(ordinaryMatrix);
        MatrixStatistics sparseStats = new MatrixStatistics(sparseMatrix);

        System.out.println("Обычная матрица:");
        System.out.println("Сумма: " + ordinaryStats.getSum());
        System.out.println("Среднее значение: " + ordinaryStats.getAverage());
        System.out.println("Максимальное значение: " + ordinaryStats.getMax());
        System.out.println("Количество ненулевых элементов: " + ordinaryStats.getNonZeroCount());
        System.out.println();
        System.out.println("Разреженная матрица:");
        System.out.println("Сумма: " + sparseStats.getSum());
        System.out.println("Среднее значение: " + sparseStats.getAverage());
        System.out.println("Максимальное значение: " + sparseStats.getMax());
        System.out.println("Количество ненулевых элементов: " + sparseStats.getNonZeroCount());
    }
}
