package com.stack.www;

/**
 * @ClassName Array
 * @Author：Mayuan
 * @Date 2021/4/1/0001 15:34
 * @Description TODO
 * @Version 1.0
 **/
/**
 * @author yinglongwu
 */


public class Array<E> {

    private E[] data;
    private int size;	//数组中实际有多少个元素

    //有参构造，用户创建时自定义数组容量大小capactity
    public Array(int capactity) {
        //data = new E[capactity];//java里不能直接new一个泛型数组
        //需要先new一个Object类型的数组再进行转换
        data = (E[])new Object[capactity];
        size = 0;
    }

    //无参构造,默认数组容量capactity为10
    public Array() {
        this(10);
    }

    //获取数组中的元素个数
    public int getSize(){
        return size;
    }

    //获取数组的容量
    public int getCapacity() {
        return data.length;
    }

    //判断数组是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    //在第index个位置插入一个新元素e
    public void add(int index, E e) {
        //判断下标是否合理
        if (index<0 || index>size) {
            throw new IllegalArgumentException("AddLast failed. Require index >= 0 and index <= size.");
        }
//		//判断数组是否满了
//		if (size == data.length) {
//			throw new IllegalArgumentException("AddLast failed. Array is full!");
//		}
        //判断数组是否满了，满了就扩容
        if (size == data.length) {
            resize(2*data.length);
        }
        //把数组的元素向后移一个位置
        for (int i = size-1; i >= index; i--) {
            data[i+1] = data[i];
        }
        //插入元素
        data[index] = e;
        size++;
    }

    //向所有元素后添加一个新元素
    public void addLast(E e) {
        add(size, e);
    }

    //向所有元素前添加一个新元素
    public void addFirst(E e) {
        add(0, e);
    }

    //获取index索引位置的元素
    public E get (int index) {
        //判断下标是否合理
        if (index<0 || index>=size) {
            throw new IllegalArgumentException("Get failed. Index is illegal.");
        }
        return data[index];
    }

    //获取最后一个元素
    public E getLast() {
        return get(size-1);
    }

    //获取第一个元素
    public E getFirst() {
        return get(0);
    }

    //修改index索引位置的元素为e
    void set(int index, E e) {
        //判断下标是否合理
        if (index<0 || index>=size) {
            throw new IllegalArgumentException("Set failed. Index is illegal.");
        }
        data[index] = e;
    }

    //查找数组中是否有元素e
    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            //两个类对象进行值的比较使用equals
            if (data[i].equals(e)) {
                return true;
            }
        }
        return false;
    }

    //查找数组中第一个元素e所在的索引，如果不存在元素e，则返回-1
    public int find(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }

    //从数组中删除index位置的元素，返回删除的元素
    public E remove(int index) {
        //判断下标是否合理
        if (index<0 || index>=size) {
            throw new IllegalArgumentException("Remove failed. Index is illegal.");
        }

        //存放要被删除的数
        E ret = data[index];
        //数组元素前移一个位置
        for (int i = index+1; i < size; i++) {
            data[i-1] = data[i];
        }
        size--;
        //下面这句可加可不加，加上之后，java会自动回收，不加上就等下次这个位置指向新的对象，才回收这次的对象
        data[size] = null; //loitering objects != memory leak 闲逛的对象不等于内存泄漏，
        //如果当前元素个数等于数组的1/4，数组容量缩小1/2（减小复杂度震荡），可以节约空间
        if (size == data.length/4 && data.length/2!=0) {
            resize(data.length/2);
        }
        return ret;
    }

    //删除数组中的第一个元素，返回删除的元素
    public E removeFirst() {
        return remove(0);
    }

    //删除数组中最后一个元素，返回删除的元素
    public E removeLast() {
        return remove(size-1);
    }

    //从数组中删除第一个出现的元素e（如果存在则删除）
    public void removeElement(E e) {
        int index = find(e);
        if (index!=-1) {
            remove(index);
        }
    }

    //重写toString方法，用于显示数组信息
    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("Array: size = %d, capacity = %d\n",size,data.length));
        res.append('[');
        for (int i = 0; i < size; i++) {
            res.append(data[i]);
            if (i != size - 1) {
                res.append(", ");
            }
        }
        res.append(']');
        return res.toString();
    }

    //数组扩容
    private void resize(int newCapacity) {
        //新建一个数组
        E[] newData = (E[])new Object[newCapacity];
        //把原数组内容写入新的数组
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }
}

