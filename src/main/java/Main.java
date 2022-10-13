import ru.list.MyList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.IntFunction;

public class Main {
    public static void main(String[] args) {
        MyList list = new MyList();
        list.add("123");
        list.add("456");
        list.add("789");
        list.add("012");
        list.size();
        System.out.println(list.isEmpty());
        System.out.println(list.contains("123"));

        List<String> listTwo = new ArrayList<>();
        listTwo.add("456");
        listTwo.add("012");

        MyList.AuthorHolder author = new MyList.AuthorHolder() {
            @Override
            public String getAuthor() {
                return MyList.AuthorHolder.super.getAuthor();
            }
        };
        System.out.println();
        System.out.println(author.getAuthor());
    }
}
