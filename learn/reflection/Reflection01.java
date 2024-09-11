package learn.reflection;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;

public class Reflection01 {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.load(new FileInputStream("learn/reflection/re.properties"));
        String classfullpath = properties.get("classfullpath").toString();
        String methodName = properties.get("method").toString();

        // 使用反射机制解决
        // (1)加载类  返回Class类型的对象
        Class aClass=Class.forName(classfullpath);
        // (2)通过aClass对象，可以得到你加载的类
        Object o = aClass.getDeclaredConstructor().newInstance();
        System.out.println(o.getClass());
        // (3)通过aClass得到你加载的类的方法，即 在反射中，方法可以视为对象（万物皆对象）
        Method method1=aClass.getMethod(methodName);
        // (4)通过method1调用方法：即 通过方法对象来实现调用方法
        method1.invoke(o); // 传统方法 对象.方法， 反射机制 方法.invoke(对象)

        // java.lang.reflect.Field: 代表类的成员变量，Field对象表示某个类的成员变量
        // 得到name字段
        // getField 不能得到私有的属性
        Field nameField=aClass.getField("age");
        System.out.println(nameField.get(o));

        //java.lang.reflect.Constructor 构造器
        Constructor constructor = aClass.getConstructor();  // ()中可以指定构造器参数类型， 返回无参构造器
        System.out.println(constructor);

        

        Constructor constructor2= aClass.getConstructor(String.class); // 这里传入的String.class 就是String类的Class对象
        System.out.println(constructor2);
    }
}
