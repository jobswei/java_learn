package learn.reflection;

import java.io.Serializable;

// 演示那些类有Class对象
public class AllTypeClass {
    public static void main(String[] args) {
        Object string = String.class;
        Object serializable = Serializable.class;
        Object integer = Integer[].class;
        Object f = float[][].class;
        Object deprecated = Deprecated.class;
        Object state = Thread.State.class;
        Object l = long.class;
        Object name = void.class;
        Object class1 = Class.class;
    }
}
