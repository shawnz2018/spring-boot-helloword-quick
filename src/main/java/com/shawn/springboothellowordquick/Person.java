package com.shawn.springboothellowordquick;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;


/*
 * 将配置文件中配置的每一个属性的值，映射到这个组件中
 * @ConfigurationProperties，告诉SpringBoot将本类中的所有属性和配置文件中相关联的配置进行配置绑定
 *    prefix="Person" ,配置文件中哪个下面的所有属性进行一一映射
 *
 *只有这个组件是容器中的组件时，才能使用容器提供的@ConfigurationProperties的功能
 * 默认读取全局配置文件
 * */
@Component
@ConfigurationProperties(prefix = "person")
//下面的标签代表读取指定路径的配置文件
//@PropertySource(Value={"classpath: person.properties"})
//@Validated
public class Person {

    /*
     * 除了上面的注解，还有另外一种方法读取数据
     * @Value标签
     *
     * <bean class="Person">
     *     <property name="shawn" value="自变量/ $从环境变量、配置文件中取值 /  #{  SpringEL 表达式}  ">
     *     </bean>
     *相较于@ConfigurationProperties，后者更方便，可以批量配置属性，支持松散语法绑定，支持JR303数据 校验（类头有@Validated）
     *@Value支持SpringEL 表达式。而CongfigurationProperties注解不支持
     *
     * */


    // @Value("${person.name}")
    //这个是测试从配置文件中取值
    private String name;


    //@Value("#{11*2}")
    //这个是测试SpringEL表达式
    private int age;
    private Map<String, Object> map;
    private List<Object> list;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", map=" + map +
                ", list=" + list +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }
}
