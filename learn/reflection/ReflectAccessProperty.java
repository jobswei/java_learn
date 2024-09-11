package learn.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

// 演示反射操作属性
public class ReflectAccessProperty {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, NoSuchFieldException {
        Class<?> cls = Class.forName("learn.reflection.Student");
        Object o = cls.getConstructor().newInstance();
        // 使用反射得到age属性对象
        Field age = cls.getField("age");
        age.set(o, 898);
        System.out.println(age.get(o));

        // 使用反射操作name属性
        Field name = cls.getDeclaredField("name");
        name.setAccessible(true);
        // name.set(o,"dsfdsfd");
        name.set(null," name"); // 静态的变量，实例对象写成空也是可以的
        System.out.println(name.get(o));
        System.out.println(name.get(null)); // 只有静态的可以这样写

    }
}


class Student{
    public int age;
    private static String name;

    public Student(){}
}