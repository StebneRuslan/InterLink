package figure;

import java.awt.*;

public class Circle extends Figure {

    private double radius;

    public Circle(double radius, Color color){
        super.setColor(color);
        this.radius = radius;
        if (!validation.sideValidation((radius))) {
            throw new IllegalArgumentException("Radius cannot be negative. ");
        }
    }

    public double area(){
        return Math.pow(radius, 2) * Math.PI;
    }

    public void draw(){
        System.out.println("Circle");
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (!validation.sideValidation((radius))) {
            throw new IllegalArgumentException("Radius cannot be negative. ");
        } else {
            this.radius = radius;
        }
    }
}
