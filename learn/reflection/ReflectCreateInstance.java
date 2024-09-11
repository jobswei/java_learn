package learn.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectCreateInstance {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        // 1. 先获取到User类的Class对象
        Class<?> userCls = Class.forName("learn.reflection.User");
        // 2. 通过public的无参构造器，创建实例
        Object newInstance = userCls.getDeclaredConstructor().newInstance();
        // 3. 通过public的有参构造器
        Constructor<?> constructor = userCls.getConstructor(String.class);
        Object newInstance2 = constructor.newInstance("fe");
        // 4. 通过非public的有参构造器
        // 4.1 得到private 的构造器对象
        Constructor<?> declaredConstructor = userCls.getDeclaredConstructor(String.class, int.class);
        // 4.2 创建实例
        declaredConstructor.setAccessible(true); // 爆破 使用反射可以访问private构造器
        Object newInstance3 = declaredConstructor.newInstance("df",10);

    }
    
}

class User{
    private String name="efef";
    private int age=18;



    private User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public User(String name) {
        this.name = name;
    }
    public User(){}

}