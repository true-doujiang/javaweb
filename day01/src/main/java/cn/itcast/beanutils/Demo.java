package cn.itcast.beanutils;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConversionException;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.Converter;
import org.apache.commons.beanutils.locale.converters.DateLocaleConverter;
import org.junit.Test;
import sun.tools.tree.ConvertExpression;

import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * author: youhh
 * date: 2018/6/19 下午11:06
 * description: beanutils框架（Apache开发的）操纵bean的属性
 *              加入common-beanutils.jar  它又依赖common-logging.jar
 */
public class Demo {



    @Test
    public void test1() throws Exception {
        Person p = new Person();
        BeanUtils.setProperty(p, "name", "Apache");
        System.out.println(p);

        BeanUtils.setProperty(p, "idea.sixing", "我好帅");
        System.out.println(p);
    }

    /**
     *   默认只支持8种基本类型的转换
     */
    @Test
    public void test2 () throws Exception {
        Person p = new Person();
        BeanUtils.setProperty(p, "name", "yhh");
        BeanUtils.setProperty(p, "age", "18");
        BeanUtils.setProperty(p, "age2", "18");
        BeanUtils.setProperty(p, "age3", "18");
        BeanUtils.setProperty(p, "password", "password123");

        //DateConverter does not support default String to 'Date' conversion.
        //BeanUtils.setProperty(p, "birthday", "2018-06-19");

        System.out.println(p);
    }


    @Test
    public void test3() throws Exception {

        //注册一个时间类型的转化器
        ConvertUtils.register(new Converter() {
            @Override
            public Object convert(Class type, Object value) {
                System.out.println(type);
                System.out.println(value);
                if (!(value instanceof String)) {
                    throw new ConversionException("必须为String类型"); //抛哪个异常查API
                }

                String val = (String) value;
                if ("".equals(val.trim())) {
                    return null;
                }
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Date date = null;
                try {
                    date = sdf.parse(val);
                } catch (ParseException e) {
                    //抛一个运行时异常、不可以继续运行了。 e放进去，异常链不能断
                    throw new RuntimeException(e);
                }
                return date;
            }
        }, Date.class);

        Person p = new Person();
        BeanUtils.setProperty(p, "birthday", "2018-06-19");
        System.out.println(p);
        System.out.println(BeanUtils.getProperty(p, "birthday"));
    }

    @Test
    public void test4() throws Exception{
        //自带的类型转换器，不好用
        ConvertUtils.register(new DateLocaleConverter(), Date.class);

        Person p = new Person();
        BeanUtils.setProperty(p, "birthday", "2018-06-19");

        System.out.println(p);
    }

    @Test
    public void test5() throws Exception {
        Map map = new HashMap<>();
        map.put("name", "apache");
        map.put("age", 18);
        map.put("age2", 18);
        map.put("age3", 18);
        map.put("birthday", "2018-06-19");

        ConvertUtils.register(new DateLocaleConverter(), Date.class);
        Person p = new Person();
        //populate 好使
        BeanUtils.populate(p, map);

        System.out.println(p);
        System.out.println(p.getBirthday().toLocaleString());
    }



}
