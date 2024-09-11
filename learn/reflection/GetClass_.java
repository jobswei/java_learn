package learn.reflection;


// 演示得到Class对象的各种方式(6)
public class GetClass_ {
    public static void main(String[] args) throws ClassNotFoundException {
        // 1. Class.forName
        String classFullPath="learn.reflection.Car";
        Class<?> cls1 = Class.forName(classFullPath);
        System.out.println(cls1.getName());
        // 2. 类名.class  应用场景：多用于参数传递
        Class cls2=Car.class;
        System.out.println(cls2);

        // 3. 对象名.getClass()
        Car car = new Car();
        Class cls3 = car.getClass();
        System.out.println(cls3);

        // 4. 通过类加载器【4种】获取类的Class对象
        // (1) 先得到类加载器 car
        ClassLoader classLoader = car.getClass().getClassLoader();
        // (2) 通过类加载器得到Class对象
        Class<?> cls4 = classLoader.loadClass(classFullPath);
        
        // 四种方式得到的类对象是同一个东西
        System.out.println(cls1.hashCode());        
        System.out.println(cls2.hashCode());
        System.out.println(cls3.hashCode());
        System.out.println(cls4.hashCode());

        // 5. 基本数据类型的Class对象
        Class<Integer> integerClass = int.class;
        Class<Boolean> booleanClass = boolean.class;
        Class<Character> charClass = char.class;

        // 6. 基本数据类型对应的包装类，可以通过 .TYPE 得到Class对象
        Class<Integer> intType = Integer.TYPE;
        Class<Character> charType = Character.TYPE;

        

    }
    
}
