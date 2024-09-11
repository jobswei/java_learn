package learn.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Class02 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, NoSuchFieldException {
        String classFullPath="learn.reflection.Car";

        // <?>表示不确定的Java类型
        Class<?> cls = Class.forName(classFullPath);
        // 2. 输出cls
        System.out.println(cls); // 显示cls对象，是哪个类的cls对象 com.hspedu.Car
        System.out.println(cls.getClass()); // 输出cls运行类型 java.lang.Class
        // 3. 得到包的名字
        System.out.println(cls.getPackage().getName());
        // 4. 得到全类名
        System.out.println(cls.getName());
        // 5. 生成对象实例
        Object o = cls.getDeclaredConstructor().newInstance();
        System.out.println(o);

        // 6. 通过反射获取属性
        // 这事私有属性，对报错  私有属性怎么获取，以后讲
        // Field name = cls.getField("name");
        // System.out.println(name.get(o));
        Field price = cls.getField("price");
        System.out.println(price.get(o));
        // 7. 通过反射给属性赋值
        price.set(o, 20000000);
        System.out.println(price.get(o));
        // 8. 我希望大家可以遍历得到所有的属性
        Field[] fields = cls.getFields();
        for(Field i:fields){
            System.out.println(i.getName());
        } 


    }
}
