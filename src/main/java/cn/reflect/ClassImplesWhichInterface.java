package cn.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class ClassImplesWhichInterface {

    public static void main(String[] args) throws Exception {
        Class<?> demo = Class.forName("cn.reflect.Person");
        //获取接口类
        Class<?> interfaces[] = demo.getInterfaces();
        //获取父类
        Class<?> parents = demo.getSuperclass();
        //获取所有的构造函数
        Constructor<?> constructors[] = demo.getConstructors();
        for (int i = 0; i < interfaces.length; i++) {
            System.out.println("实现了哪些接口类:" + interfaces[i].getName());
        }
        for (int i = 0; i < constructors.length; i++) {
            System.out.println("类有哪些构造函数:" + constructors[i]);
        }
        System.out.println("继承的父类:" + parents.getName());
        for (int i = 0; i < constructors.length; i++) {
            Class<?> paramenter[] = constructors[i].getParameterTypes();
            int mo = constructors[i].getModifiers();
            System.out.println(Modifier.toString(mo) + " " + constructors[i].getName());
            for (int j = 0; j < paramenter.length; j++) {
                System.out.println(paramenter[j].getName());
            }
        }
    }

}
