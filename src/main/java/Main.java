import ru.list.MyList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyList list = new MyList();
        list.add("123");
        list.add(4);
        list.add("Салют");

        Collection<String> array = new ArrayList<>();
        array.add("345");
        array.add("Пожар");
        array.add("987");

        list.print();
    }
}
