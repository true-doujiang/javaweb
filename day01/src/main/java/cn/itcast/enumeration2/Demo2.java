package cn.itcast.enumeration2;

import org.junit.Test;

/**
 * author: youhh
 * date: 2018/6/18 下午7:04
 * description:
 */
public class Demo2 {

    @Test
    public void test() {
        System.out.println(Grade.A.getValue());
        System.out.println(Grade.B.localValue());
    }

}


enum Grade {

    A("100-90") {
        //每个实例都必须实现该方法
        @Override
        public String localValue() {
            return "优秀";
        }
    }, B("89-80") {
        @Override
        public String localValue() {
            return "良好";
        }
    }, C("79-70") {
        @Override
        public String localValue() {
            return "一般";
        }
    }, D("69-60") {
        @Override
        public String localValue() {
            return "及格";
        }
    }, E("59-0") {
        @Override
        public String localValue() {
            return "不及格";
        }
    };

    //封装每个对象的分数
    private String name;

    //抽象方法
    public abstract String localValue();

    //构造器不可以是public
    private Grade(String name) {
        this.name = name;
    }

    public String getValue() {
        return name;
    }
}
