package ru.list;

import java.util.*;

import static com.sun.tools.attach.VirtualMachine.list;

public class MyList<T> implements List<T> {
    private List<T> list = new ArrayList<>();

    @Override
    public int size() {
        int size = 0;
        for(T t: list)
            size++;
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean contains(Object o) {
        boolean flag = false;
        for (T t: list) {
            if (t.equals(o))
                flag = true;
        }
        return flag;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        Object[] ob = new Object[size()];
        for (int i = 0; i < list.size(); i++) {
            String st = (String) list.get(i);
            ob[i] = st;
        }
        System.out.println(ob);
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        list.add((T) o);
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public T get(int index) {
        return null;
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
