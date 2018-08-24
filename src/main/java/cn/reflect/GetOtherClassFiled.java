package cn.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class GetOtherClassFiled {

    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> demo = Class.forName("cn.reflect.Person");
        System.out.println("获取当前类的所有属性:=========================");
        Field[] fields = demo.getDeclaredFields();
        for(int i = 0;i < fields.length;i++) {
            int mo = fields[i].getModifiers();
            //修饰符
            String prev = Modifier.toString(mo);
            //属性类型
            Class<?> type = fields[i].getType();
            System.out.println(prev + " " + type.getName() + " " + fields[i].getName());
        }

        System.out.println("获取父类的所有属性:=========================");
        Field[] fields2 = demo.getFields();
        for(int i = 0;i < fields2.length;i++) {
            int mo = fields2[i].getModifiers();
            //修饰符
            String prev = Modifier.toString(mo);
            //属性类型
            Class<?> type = fields2[i].getType();
            System.out.println(prev + " " + type.getName() + " " + fields2[i].getName());

        }
    }


}
