package com.jz.forge.design.迭代器;



/**
 * 抽象聚合
 * @author james
 * @version 1.0
 * @date 2023/6/29 17:13
 */
public interface Aggregate {

    public void add(Object obj);

    public void remove(Object obj);

    public Iterator getIterator();
}
