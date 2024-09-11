package learn.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.Test;

/**
 * ReflectionUtils
 * 演示如何通过反射获取类的结构信息
 */
public class ReflectionUtils {
    public static void main(String[] args) {
        
    }

    // 第一组方法API
    @Test
    public void api_01() throws ClassNotFoundException{
        Class personCls = Class.forName("learn.reflection.Person");
        // getName 获取全类名
        System.out.println(personCls.getName());
        // getSimpleName 获取简单类名
        System.out.println(personCls.getSimpleName());
        // getFields 获取所有的public属性 ，包括从父类继承的
        Field[] fields = personCls.getFields();
        for (Field field : fields) {
            System.out.println("Attributes of this class and its parent class: " +field.getName());
        }
        // getDeclaredFields 获取所有属性
        Field[] declaredFields = personCls.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("All attribuates: "+declaredField.getName());
        }
        // getMethods 本类及父类的所有的public方法
        Method[] methods = personCls.getMethods();
        for (Method method : methods) {
            System.out.println("public Methods: "+method.getName());
        }
        // getDeclaredMethods 所有方法
        Method[] declaredMethods = personCls.getDeclaredMethods();
        for (Field declaredField : declaredFields) {
            System.out.println("All method : "+declaredField.getName());
        }
        // getContructors 所有public修饰的构造器，包括父类
        Constructor[] constructors = personCls.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println("public Constructors: "+constructor.getName());
        }
        // 所有构造器
        Constructor[] declaredConstructors = personCls.getDeclaredConstructors();
        for (Constructor declaredConstructor : declaredConstructors) {
            System.out.println("all constroserfsdf: "+declaredConstructor.getName());
        }
        // getPackage: 以Package形式返回包信息
        System.out.println(personCls.getPackage());
        // getSuperClass: 以Class形式返回父类信息
        Class superclass = personCls.getSuperclass();
        System.out.println("parent class: "+superclass);
        // getInterfaces 返回接口
        Class[] interfaces = personCls.getInterfaces();
        for (Class interfacee : interfaces) {
            System.out.println("interface: "+interfacee);
        }
        // getAnnotations 返回注解信息
        Annotation[] annotations = personCls.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }

    }

    @Test
    public void api_02() throws ClassNotFoundException{
        Class personCls = Class.forName("learn.reflection.Person");
        // getModifiers 以int形式返回修饰符 default=0, public=1, private=2, protected=4, static=8, final=10
        Field[] declaredFields = personCls.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("All attribuates: "+declaredField.getName()
            +" xiu shi fu zhi: "+declaredField.getModifiers()
            +" gai shu xing de lei xing: "+declaredField.getType());
        }

        Method[] declaredMethods = personCls.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println("All method : "+declaredMethod.getName()+
            " "+declaredMethod.getModifiers()
            +" "+declaredMethod.getReturnType());    
            // 输出当前方法的形参数组情况
            Class<?>[] parameterTypes = declaredMethod.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                System.out.println("parametertype: "+parameterType);
                
            }
        }


    }

    
}

interface IA{}
interface IB{}
class A{
    public String hobby="f";
    public void h1(){}
    public A(){}
}
@Deprecated // 这是注解信息
class Person extends A implements IA,IB{
    public String name="efef";
    protected int age=18;
    String job="coder";
    private double sal=10100;

    public void m1(String name, int age){}
    protected void m2(){}
    void m3(){}
    private void m4(){}
    public Person(){}
    private Person(String name){}

}