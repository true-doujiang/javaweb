package cn.itcast.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * author: youhh
 * date: 2018/6/18 下午3:12
 * description:
 */
public class Demo2 {

    /**
     *  对象类型只能强制转成对象类型， 不可以转成基本数据类型
     *  但是： 包装类型的对象可以转换成相应的基本数据类型
     */

    public static void main(String[] args) {
        Integer i = 1; //装箱
        int j = i;      //拆箱

        List<Integer> list = new ArrayList<>();
        list.add(1);
        int integer = list.get(0);
        System.out.println(integer);

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int next = it.next(); //拆箱   Object类型不可以直接转成基本数据类型，但是可以转成基本数据类型的包装类型
            System.out.println(next);
        }

        List list2 = new ArrayList<>();
        list2.add(1);
        int x = (Integer) list2.get(0);  //ok
        System.out.println(x);
    }
}
