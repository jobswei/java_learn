package learn.reflection;

public class Class01 {
    // Class 类不是new出来的，而是系统创建的
    
    public static void main(String[] args) throws ClassNotFoundException {
        // (1) 传统new对象的方法
        /*
         *  public Class<?> loadClass(String name) throws ClassNotFoundException {
                return loadClass(name, false);
            }
         */
        // Cat cat = new Cat();

        // (2) 反射的方式，刚才老师没有debug到ClassLoader的loadClass，原因是我没有注销Cat cat = new Cat();
        Class cls1=Class.forName("learn.reflection.Cat");

        // (3)  类只加载一次。某个类的Class对象，在内存中只有一份
        Class cls2 = Class.forName("learn.reflection.Cat");
        System.out.println(cls1.hashCode());
        System.out.println(cls2.hashCode());
        


    }
}
