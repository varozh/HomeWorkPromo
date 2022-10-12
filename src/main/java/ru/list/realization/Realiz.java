package ru.list.realization;

import java.lang.reflect.Array;
import java.util.*;

public class Realiz<T> implements List<T> {
    private Object[] list = new Object[0];

    @Override
    public int size() {
        return list.length;
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
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        Object[] newList = new Object[list.length];
        for (int i = 0; i < list.length; i++)
            list[i] = newList[i];
        return newList;
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {

        return null;
    }

    @Override
    public boolean add(T t) {
        int size = list.length;
        Object[] newList = Arrays.copyOf(list, list.length + 1);
        if (list.length == 0)
            newList[0] = t;
        else
            newList[newList.length - 1] = t;
        list = Arrays.copyOf(newList, newList.length);
        return size + 1 == list.length;
    }

    @Override
    public boolean remove(Object o) {
        boolean flag = false;
        for(int i = 0; i < list.length - 1; i++) {
            if (list[i].equals(o))
                flag = true;
            if (flag) {
                list[i] = list[i + 1];
            }
        }
        if (flag)
            list = Arrays.copyOf(list, list.length - 1);
        return flag;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        boolean flag = false;
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            for (Object ob: c) {
                if (list[i].equals(ob)) {
                    count++;
                    break;
                }
            }
        }
        if (count == c.size())
            flag = true;
        return flag;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {

        return true;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        int size = list.length;
        Object[] newList = Arrays.copyOf(list, list.length + c.size());
        Object[] array = c.toArray();
        int count = 0;
        for (int i = index + array.length; i < newList.length; i++)
            newList[i] = newList[i - array.length];
        count = 0;
        for (int i = index; i < newList.length - (list.length - index); i++)
            newList[i] = array[count++];
        list = Arrays.copyOf(newList, newList.length);
        return size + c.size() == list.length;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        int count = 0;
        Object[] array = c.toArray();
        for (int i = 0; i < array.length; i++) {
            if (contains(array[i])) {
                count++;
            }
        }
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
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
    public T set(int index, T element) {
        return null;
    }

    @Override
    public void add(int index, T element) {

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
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }

    public void print() {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
