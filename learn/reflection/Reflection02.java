package learn.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// 反射比较灵活，但耗时较大
@SuppressWarnings({"all"})
public class Reflection02 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        traditional();
        reflec();
        reflec2();
    }

    public static void traditional(){

        Cat cat = new Cat();
        long start=System.currentTimeMillis();
        for(int i=0;i<900000000;i++){
            cat.test();
        }
        long end=System.currentTimeMillis();
        System.out.println("traditional time "+(end-start));
    }

    public static void reflec() throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException{

        Class aClass=Class.forName("learn.reflection.Cat");
        
        Method method=aClass.getMethod("test");
        Object o = aClass.getDeclaredConstructor().newInstance();
        long start=System.currentTimeMillis();
        for(int i=0;i<900000000;i++){
            method.invoke(o);
        }
        long end=System.currentTimeMillis();
        System.out.println("reflection time "+(end-start));


    }
    public static void reflec2() throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException{

        Class aClass=Class.forName("learn.reflection.Cat");
        
        Method method=aClass.getMethod("test");
        Object o = aClass.getDeclaredConstructor().newInstance();
        method.setAccessible(true);  // 反射调用方法时，取消反射检查，可以提高速度
        long start=System.currentTimeMillis();
        for(int i=0;i<900000000;i++){
            method.invoke(o);
        }
        long end=System.currentTimeMillis();
        System.out.println("reflection time "+(end-start));


    }

}
