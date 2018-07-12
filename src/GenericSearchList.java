import java.util.ArrayList;
import java.util.List;

public class GenericSearchList<I, T> {
    public <I extends Iterable<T>> List<T> search(I i, Predicate predicate) {
        List<T> list = new ArrayList<>();
        for (T t: i) {
            if (predicate.evaluate(t)) {
                list.add(t);
            }
        }
        return list;
    }
}
