import java.util.Arrays;

public class OrdinaryVector implements Vector {
    private final int[] data;

    public OrdinaryVector(int size) {
        data = new int[size];
    }

    @Override
    public int getSize() {
        return data.length;
    }

    @Override
    public int getValue(int index) {
        return data[index];
    }

    @Override
    public void setValue(int index, int value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "OrdinaryVector{" +
                "data=" + Arrays.toString(data) +
                '}';
    }
}
