import java.util.*;
class EnumerationAdapter<T> implements Iterator<T> {
    private Enumeration<T> enumeration;
    EnumerationAdapter(Enumeration<T> enumeration) { this.enumeration = enumeration; }
    public boolean hasNext() { return enumeration.hasMoreElements(); }
    public T next() { return enumeration.nextElement(); }
    public void remove() { throw new UnsupportedOperationException("remove() not supported"); }
}

public class AdapterPatternExample {
    public static void main(String[] args) {
        Enumeration<Integer> enumeration = new Vector<>(Arrays.asList(1, 2, 3, 4, 5)).elements();
        Iterator<Integer> iterator = new EnumerationAdapter<>(enumeration);
        while (iterator.hasNext()) { System.out.println(iterator.next()); }
    }
}
