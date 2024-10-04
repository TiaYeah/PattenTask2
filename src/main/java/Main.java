public class Main {
    public static void main(String[] args) {
        Vector vector = new SparseVector(10);
        System.out.println(vector);

        Matrix ordinaryMatrix = new OrdinaryMatrix(5, 5);
        Matrix sparseMatrix = new SparseMatrix(5, 5);

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
        System.out.println("Количество ненулевых элементов: " + ordinaryStats.getNotZeroCount());

        System.out.println("Разреженная матрица:");
        System.out.println("Сумма: " + sparseStats.getSum());
        System.out.println("Среднее значение: " + sparseStats.getAverage());
        System.out.println("Максимальное значение: " + sparseStats.getMax());
        System.out.println("Количество ненулевых элементов: " + sparseStats.getNotZeroCount());
    }
}
