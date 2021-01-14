package com.designpattern.www.iterator.iteratorpattern;

/**
 * @ClassName ConcreteObjectList
 * @Author：Mayuan
 * @Date 2020/5/13 15:36
 * @Description TODO
 * @Version 1.0
 **/

import java.util.List;


public class ConcreteObjectList extends AbstractObjectList {

    public ConcreteObjectList(List<Object> list) {
        super(list);
        // TODO Auto-generated constructor stub
    }

    @Override
    public AbstractIterator createIterator() {
        // TODO Auto-generated method stub

        return new ProducteIterator(this);
    }

}