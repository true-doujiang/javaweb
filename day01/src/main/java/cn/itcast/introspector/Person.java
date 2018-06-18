package cn.itcast.introspector;

import java.util.Date;

/**
 * author: youhh
 * date: 2018/6/18 下午7:21
 * description:
 */
public class Person {

    private String name;     //有个set或get方法时叫属性，  没有叫字段
    private String password;
    private int age;
    private Date birthday;

    public void setAb() { //也算一个属性ab

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
