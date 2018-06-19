package cn.itcast.reflect;

/**
 * author: youhh
 * date: 2018/6/20 上午12:10
 * description:
 */
public class Demo1 {

    public static void main(String[] args) throws ClassNotFoundException {
        //1
        Class clazz1 = Class.forName("cn.itcast.reflect.Person");

        //2
        Class clazz2 = new Person().getClass();

        //3
        Class clazz3 = Person.class;

        System.out.println(clazz1);
    }
}
