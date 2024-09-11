package learn.file.exercises;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class hmk3 {
    public static void main(String [] args) throws IOException{
        Properties pp=new Properties(null);

        pp.setProperty("name", "tom");
        pp.setProperty("age", "5");
        pp.setProperty("color", "red");
        pp.store(new FileOutputStream("./learn/file/exercises/dog.properties"), "ok");

        pp.load(new FileInputStream("./learn/file/exercises/dog.properties"));
        pp.list(System.out);
        Dog dog=new Dog(pp.getProperty("name"),Integer.parseInt(pp.getProperty("age")),pp.getProperty("color"));
        System.out.println(dog);
    }
}


class Dog{
    private String name=" ";
    private int age=0;
    private String color=" ";
    public Dog(String name, int age, String color){
        this.name=name;
        this.age=age;
        this.color=color;
    }

    @Override
    public String toString(){
        return "name: "+name+"\n"+
                "age: "+age+"\n"+
                "color: "+color;

    }
}