package learn.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// 演示通过反射调用方法
public class RefelctAccessMethod {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        Class<?> cls = Class.forName("learn.reflection.Student2");
        Object o = cls.getConstructor().newInstance();
        Method method = cls.getMethod("getName");
        method.invoke(o);

        // 私有方法与返回值的问题
        Method declaredMethod = cls.getDeclaredMethod("getAge");
        declaredMethod.setAccessible(true);
        Object age=declaredMethod.invoke(o); // 接收的时候同意用Object接收
        System.out.println("run type: "+age.getClass());
        int agee=(int)age;
        System.out.println(age);

    }
}



class Student2{
    public int age=2;
    private static String name="e";

    public Student2(){}
    public void getName(){
        System.out.println(name);
    }
    private int getAge(){
        return age;
    }
}