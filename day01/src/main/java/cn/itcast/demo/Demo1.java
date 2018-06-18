package cn.itcast.demo;

import java.util.Arrays;

import static java.lang.System.out;
/**
 * author: youhh
 * date: 2018/6/18 下午3:01
 * description:
 */
public class Demo1 {

    /**
     * String、Arrays类的API 学习
     * @param args
     */

    public static void main(String[] args) {
        out.println("main");

        int[] a = new int[] {11, 3, 4, 0};
        out.println(Arrays.toString(a));

        char[] c = new char[] {95, 98, 97, 33}; //查ASCII码表  33=！
        out.println(Arrays.toString(c));

        Arrays.sort(a);
        out.println(Arrays.toString(a));
    }
}
