import ru.list.MyList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.IntFunction;

public class Main {
    public static void main(String[] args) {
        MyList list = new MyList();
        list.add("123");
        list.size();
        System.out.println(list.isEmpty());
        System.out.println(list.contains("123"));
        list.print();
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
