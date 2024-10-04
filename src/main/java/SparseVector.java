import java.util.HashMap;

public class SparseVector implements Vector{
    private int size;

    private HashMap<Integer, Integer> elements;

    public SparseVector(int size) {
        this.size = size;
        elements = new HashMap<>();
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public int getValue(int index) {
        return elements.getOrDefault(index, 0);
    }

    @Override
    public void setValue(int index, int value) {
        if (value != 0) {
            elements.put(index, value);
        } else {
            elements.remove(index);
        }
    }

    @Override
    public String toString() {
        return "SparseVector{" +
                "size=" + size +
                ", elements=" + elements +
                '}';
    }
}
