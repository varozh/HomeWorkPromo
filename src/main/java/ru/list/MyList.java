package ru.list;

import java.util.*;

public class MyList<T> implements List<T> {
    public List<T> list = new ArrayList<>();

    @Override
    public int size() {
        int size = 0;
        for (T T: list)
            size++;
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (Object t: list) {
            if (t.equals(o))
                return true;
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        int count = 0;
        boolean flag = count < list.size() && list.get(count) != null;
        if (!flag)
            return null;
        return (Iterator) list.get(count++);
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[size()];
        for (int i = 0; i < size(); i++)
            array[i] = list.get(i);
        return array;
    }

    @Override
    public boolean add(Object o) {
        list.add((T) o);
        return true;
    }

    @Override
    public boolean remove(Object o) {
        boolean flag = false;
        for(int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(o)) {
                list.remove(i);
                flag = true;
            }
        }
        return flag;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        Object[] ob = c.toArray();
        int count = 0;
        for (int i = ob.length - 1; i >= 0; i--) {
            list.add(index, (T) ob[i]);
        }
        return count > 0;
    }

    @Override
    public boolean addAll(Collection c) {
        Object[] ob = c.toArray();
        int count = 0;
        for (int i = 0; i < ob.length; i++) {
            boolean flag = true;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).equals(ob[i]))
                    flag = false;
            }
            if (flag) {
                list.add((T) ob[i]);
                count++;
            }
        }
        return count > 0;
    }

    @Override
    public void clear() {

    }

    @Override
    public T get(int index) {
        Object[] ob = list.toArray();
        return (T) ob[index];
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    public void print() {
        System.out.println(list);
    }
}
