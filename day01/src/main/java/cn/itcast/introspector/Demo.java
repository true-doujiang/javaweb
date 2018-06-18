package cn.itcast.introspector;

import org.junit.Test;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

/**
 * author: youhh
 * date: 2018/6/18 下午7:24
 * description:
 */
public class Demo {

    /**
     * 内省不需要导入jar包，这是sun公司操作bean的工具。
     * 但是Apache觉得太难用了，就开发了beanutil框架
     */

    @Test
    public void test1() throws Exception {
        BeanInfo beanInfo = Introspector.getBeanInfo(Person.class);
        //排除Object类的属性
        //BeanInfo beanInfo = Introspector.getBeanInfo(Person.class, Object.class);

        PropertyDescriptor[] pds = beanInfo.getPropertyDescriptors();
        for (PropertyDescriptor pd : pds) {
            System.out.println(pd.getName());
        }
    }

    /**
     * 操作bean的指定书序 age  直接new PropertyDescriptor
     */
    @Test
    public void test2() throws Exception {
        Person p = new Person();

        PropertyDescriptor pd = new PropertyDescriptor("age", Person.class);
        Method method = pd.getWriteMethod(); //相当于获取到了set
        method.invoke(p, 45);

        System.out.println(p.getAge());

        Method method1 = pd.getReadMethod();
        System.out.println(method1.invoke(p, null));
    }


    @Test
    public void test3() throws IntrospectionException {
        PropertyDescriptor pd = new PropertyDescriptor("birthday", Person.class);
        Class<?> type = pd.getPropertyType();
        System.out.println(type.getSimpleName());
    }

}
