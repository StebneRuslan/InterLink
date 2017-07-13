package figure;

import java.awt.*;

/**
 * Created by ruslan on 12.07.17.
 */
public class Square extends Figure {

    private double side;

    public Square(double side, Color color) {
        super.setColor(color);
        this.side = side;
        if(side <= 0) {
            throw new IllegalArgumentException("Side cannot be negative. ");
        }
    }

    public double area() {
        return Math.pow(side, 2);
    }

    public void draw() {
        System.out.println("Square");
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side > 0) {
            this.side = side;
        }
        else {
            System.out.println("Side cannot be negative. ");
        }
    }
}
