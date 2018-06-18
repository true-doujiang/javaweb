package cn.itcast.enumeration;

import org.junit.Test;


/**
 * author: youhh
 * date: 2018/6/18 下午6:39
 * description:
 */
public class Demo1 {


    @Test
    public void test() {
        say(Grade.B);
    }

    @Test
    public void test2() {
        //name()  返回枚举实例的名字， 不是A.name
        System.out.println(Grade.A.name());
        System.out.println(Grade.A.ordinal());

        //把字符串转成枚举
        String e = "E";
        Grade grade = Grade.valueOf(e);
        System.out.println(grade.getValue());

        /**
         * values() JDK文档中没有， 但是确实存在此方法，返回枚举的数组
         */
        Grade[] grades = Grade.values();
        for (Grade g : grades) {
            System.out.println(g.getValue());
        }
    }



    private void say(Grade g) {
        String value = g.getValue();
        System.out.println(value);
    }


}

enum Grade {


    A("100-90"), B("89-80"), C("79-70"), D("69-60"), E("59-0");

    //封装每个对象的分数
    private String name;

    //构造器不可以是public
    private Grade(String name) {
        this.name = name;
    }

    public String getValue() {
        return name;
    }

    //也ok
    //public String getName() {
    //   return name;
    //}
}

//JDK1.5之前没有枚举
/*
class Grade {
    private Grade(){}
    public static final Grade A = new Grade();
    public static final Grade B = new Grade();
    public static final Grade C = new Grade();
}
*/