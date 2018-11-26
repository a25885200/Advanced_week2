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
public class Circle extends Shape{
    private double radius;

    public Circle(double radius, String name, Point topLeft) {
        super(name, topLeft);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + "Area=" +getArea() +'}';
    }
    
    
    
}
