package cn.itcast.demo;

import org.junit.Test;

import java.util.*;

/**
 * author: youhh
 * date: 2018/6/18 下午3:26
 * description:
 */
public class Demo3 {

    @Test
    public void test1() {
        //Map<String, String> map = new HashMap<>();
        Map<String, String> map = new LinkedHashMap<>();
        map.put("1", "aaa");
        map.put("3", "bbb");
        map.put("2", "ccc");
        System.out.println(map);

        //传统方式1   对key迭代
        Set<String> keySet = map.keySet();
        Iterator<String> it = keySet.iterator();
        while (it.hasNext()) {
            String key = it.next();
            String val = map.get(key);
            System.out.println("key=" + key + "  val=" + val);
        }

        System.out.println("===============================");

        //传统方式2   对ke-value迭代
        Set<Map.Entry<String, String>> entries = map.entrySet();
        Iterator<Map.Entry<String, String>> it2 = entries.iterator();
        while (it2.hasNext()) {
            Map.Entry<String, String> entry = it2.next();
            System.out.println("key=" + entry.getKey() + "  val=" + entry.getValue());
        }

        System.out.println("===============================");

        //建立在传统方式之上
        Set<String> keySet2 = map.keySet();
        for (String key : keySet2) {
            String val = map.get(key);
            System.out.println("key=" + key + "  val=" + val);
        }

        System.out.println("===============================");

        Set<Map.Entry<String, String>> entries2 = map.entrySet();
        for (Map.Entry<String, String> entry : entries2) {
            System.out.println("key=" + entry.getKey() + "  val=" + entry.getValue());
        }
    }

    @Test
    public void test2() {
        int[] arr = {10, 9, 8};
        for (int i : arr) {
            System.out.println(i);
        }

        //增强for会有java.lang.NullPointerException异常
        int[] arr2 = null;
//        for(int i : arr2) {
//            System.out.println(i);
//        }
    }



}
