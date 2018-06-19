package cn.itcast.beanutils;

import java.util.Date;

/**
 * author: youhh
 * date: 2018/6/19 下午11:06
 * description:
 */
public class Person {

    private String name;     //有个set或get方法时叫属性，  没有叫字段
    private String password;
    private int age;
    private Integer age2;
    private Long age3;
    private Date birthday;

    //如果设置的属性值是其他的引用数据类型，此时必须注册一个类型转换器才是实现自动转换
    private Idea idea;


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

    public Integer getAge2() {
        return age2;
    }

    public void setAge2(Integer age2) {
        this.age2 = age2;
    }

    public Long getAge3() {
        return age3;
    }

    public void setAge3(Long age3) {
        this.age3 = age3;
    }

    public Idea getIdea() {
        return idea;
    }

    public void setIdea(Idea idea) {
        this.idea = idea;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", age2=" + age2 +
                ", age3=" + age3 +
                ", birthday=" + birthday +
                ", idea=" + idea +
                '}';
    }
}
