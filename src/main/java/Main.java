import ru.list.MyList;
import ru.list.realization.Realiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyList list = new MyList();
        /*list.add("123");
        list.add(4);
        list.add("Салют");

        Collection<String> array = new ArrayList<>();
        array.add("345");
        array.add("Пожар");
        array.add("987");

        list.set(1, 8);
        list.print();*/

        Realiz rel = new Realiz();
        rel.add("123");
        rel.add("Салют");
        rel.add("898");
        rel.add("453");

        List<String> rav = new ArrayList<>();
        rav.add("123");
        rav.add("Салют");
        rav.add("777");

        rel.removeAll(rav);

        rel.print();

    }
}
