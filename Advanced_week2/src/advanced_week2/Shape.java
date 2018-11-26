/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advanced_week2;

/**
 *
 * @author leung
 */
public abstract class Shape {
    
    private String name;
    Point topLeft;
    
    public Shape() {
    }

    public Shape(String name, Point topLeft) {
        this.name = name;
        this.topLeft = topLeft;
    }
    public abstract double getArea();

    @Override
    public String toString() {
        return "Shape{" + "name=" + name + ", topLeft=" + topLeft.toString() + '}';
    }
    
}
