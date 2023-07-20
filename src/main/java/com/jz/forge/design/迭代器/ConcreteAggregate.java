package com.jz.forge.design.迭代器;

import java.util.ArrayList;
import java.util.List;

/**
 * @author james
 * @version 1.0
 * @date 2023/6/29 17:16
 */
public class ConcreteAggregate implements Aggregate {
    private List<Object> list = new ArrayList<Object>();

    @Override
    public void add(Object obj) {
        list.add(obj);
    }

    @Override
    public void remove(Object obj) {
        list.remove(obj);
    }

    @Override
    public Iterator getIterator() {

        return (new ConcreteIterator(list));
    }
}
