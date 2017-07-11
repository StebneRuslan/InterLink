package figure;

import java.util.Random;

/**
 * Created by ruslan on 11.07.17.
 */
public class Circle extends Figure{
    private double radius;

    Circle() {
        super();
        Random random = new Random();
        radius = random.nextDouble() * 100.0;
    }

    double area() {
        return radius * radius * Math.PI;
    }

    String getParams() {
        return "radius = " + String.format("%.2f", radius);
    }

    void draw() {
        System.out.println("Draw a Circle.");
    }
}
