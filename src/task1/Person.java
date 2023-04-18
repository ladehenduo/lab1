package task1;

import java.io.Serializable;

public class Person implements Serializable{
    public String name;
    public int weight;
    private double high;


    public int getWeight() {
        return this.weight;
    }
    private double getHigh() {
        return this.high;
    }
    public void setWeigh(int w) {
        this.weight = w;
    }
    public void setHigh(double h) {
        this.high = h;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void show() {
        System.out.println("姓名：" + name + "\n身高：" + high + "cm\n体重：" + weight + "kg");
        System.out.println("----------------------------------------------------");
    }
}
