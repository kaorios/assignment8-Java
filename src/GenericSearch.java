public class GenericSearch<I, T> {
    public <I extends Iterable<T>> int search(I i, Predicate predicate) {
        int count = 0;
        for (T t: i) {
            if (predicate.evaluate(t)) {
                count++;
            }
        }
        return count;
    }
}
