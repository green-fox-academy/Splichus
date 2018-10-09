import java.util.Arrays;

public class Domino implements Comparable<Domino>{
    private final int[] values;

    public Domino(int valueA, int valueB) {
        this.values = new int[]{valueA, valueB};
    }

    public int[] getValues() {
        return values;
    }

    @Override
    public String toString() {
        return "[" + values[0] + ", " + values[1] + "]";
    }

    @Override
    public int compareTo(Domino domino) {
        return this.getValues()[1]-domino.getValues()[1];
    }
}