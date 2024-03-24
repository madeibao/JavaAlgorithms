package com.designpattern.www.iterator.iteratorpattern;

/**
 * @ClassName ProducteIterator
 * @Author：Mayuan
 * @Date 2020/5/13 15:37
 * @Description TODO
 * @Version 1.0
 **/

import java.util.ArrayList;
import java.util.List;

public class ProducteIterator extends AbstractIterator {
    private List<Object> objectList = new ArrayList<Object>();
    private int cursor1;    //游标
    private int cursor2;    //游标2

    public ProducteIterator(ConcreteObjectList obj) {
        // TODO Auto-generated constructor stub
        this.objectList = obj.getObjectList();
        cursor1 = 0;
        cursor2 = objectList.size() - 1;
    }

    @Override
    public void next() {
        // TODO Auto-generated method stub
        if (cursor1 < objectList.size()) {
            cursor1++;
        }
    }

    @Override
    public void previous() {
        // TODO Auto-generated method stub
        if (cursor2 > -1) {
            cursor2--;
        }
    }

    @Override
    public Object getPrevious() {
        // TODO Auto-generated method stub
        return objectList.get(cursor2);
    }

    @Override
    public Object getNext() {
        // TODO Auto-generated method stub
        return objectList.get(cursor1);
    }

    @Override
    public boolean isNext() {
        // TODO Auto-generated method stub
        return (cursor1 == objectList.size());
    }

    @Override
    public boolean isFrist() {
        // TODO Auto-generated method stub
        return (cursor2 == -1);
    }

}