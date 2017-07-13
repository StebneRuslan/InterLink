package figure;

import java.awt.*;

/**
 * Created by ruslan on 12.07.17.
 */
public class Circle extends Figure {

    private double radius;

    public Circle(double radius, Color color){
        super.setColor(color);
        this.radius = radius;
        if(radius <= 0) {
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
        if(radius > 0) {
            this.radius = radius;
        }
        else {
            System.out.println("Radius cannot be negative. ");
        }
    }
}
