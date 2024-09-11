package learn.reflection;

public class Car {
    private String name="dvdv";
    public int price=100000000;

    public String getName() {
        return name; 
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString(){
        return "name= "+name;
    }

    
}
