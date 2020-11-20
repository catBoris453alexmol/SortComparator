package Sort;

import ru.sapteh.Person;

import java.util.Comparator;

public class SortByPricework implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.getPricework() - p2.getPricework();
    }
}
