public class PagePredicate implements Predicate<Page> {
    public boolean evaluate(Page page) {
        if (page.isHasImage() && page.isEvenPage()) {
            return true;
        }
        return false;
    }
}
