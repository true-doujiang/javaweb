package cn.itcast.demo;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * author: youhh
 * date: 2018/6/18 下午6:17
 * description:
 */
public class Demo4 {

    @Test
    public void testSum() {
        sum(1, 2, 3, 4);
        int[] arr = {1, 3, 4, 5};
        sum(arr); //ok
    }

    /**
     * @param nums
     * 编译器会自动创建一个数组保存传递的参数
     * 因此，程序员可以在方法中以数组的形式访问 可变参数 ， 可以把nums当做一个数组
     */
    private void sum(int ...nums) {
        int sum = 0;
        for(int i : nums) {
            System.out.println(i);
            sum += i;
        }
        System.out.println("sum= " + sum);
    }


    /**
     * 可变参数注意问题
     */
    //public void aa(int ...nums, int x){}; //可变参数不能放在最前面
    //public void aa(int x, int ...nums){}; //ok


    @Test
    public void test2() {
        List<String> list = Arrays.asList("1", "0", "4");
        System.out.println(list);

        String[] str = new String[]{"a", "b", "tt"};
        List<String> list2 = Arrays.asList(str);
        System.out.println(list2);


        /**
         *     接收的是对象类型
         *     public static <T> List<T> asList(T... a) {
         *         return new ArrayList<>(a);
         *     }
         */
        int[] arr = {1, 3, 9};
        List<int[]> list3 = Arrays.asList(arr);
        System.out.println(list3);

    }





}
