package com.ang.chapter5_7;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * @author: 于昂
 * @date: 2023/3/8
 * <p>
 * 在JVM中, 每个类都有一个Class对象, 用来存储类的信息, 包括类的名称, 类的属性, 方法, 父类等等.
 **/
public class ClassDemo {
    public static void main(String[] args) {
        //读取class信息
//        readClass();
        //获取属性
//        getFields();
        //获取构造方法
//        getConstructors();

    }

    private static void getConstructors() {
        Constructor<?>[] constructors = Employee.class
                .getConstructors();
        Constructor<?>[] declaredConstructors = Employee.class
                .getDeclaredConstructors();

        for (Constructor<?> constructor : constructors) {
            System.out.println("constructor: " + constructor.getName());
        }
        for (Constructor<?> constructor : declaredConstructors) {
            System.out.println("declaredConstructor: " + constructor.getName());
        }
    }

    private static void readClass() {
        Employee e = new Employee();
        System.out.println(e.getClass()
                            .getName() + " " + e.getName());
    }

    private static void getFields() {
        //获取全部属性
        Field[] declaredFields = Employee.class
                .getDeclaredFields();
        //获取公共属性
        Field[] fields = Employee.class
                .getFields();

        for (Field field : declaredFields) {
            System.out.println("declaredFields: " + field.getName());
        }
        for (Field field : fields) {
            System.out.println("fields: " + field.getName());
        }
    }
}
