package learn.reflection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

@SuppressWarnings({"all"}) // 抑制警告
public class ReflectionQuestion {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
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
    }
}
