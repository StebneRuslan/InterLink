package figure;

import java.awt.*;

public class Square extends Figure {

    private double side;

    public Square(double side, Color color) {
        super.setColor(color);
        this.side = side;
        if (!validation.sideValidation(side)) {
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
        if (!validation.sideValidation(side)) {
            throw new IllegalArgumentException("Side cannot be negative. ");
        } else {
            this.side = side;
        }
    }
}
