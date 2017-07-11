package figure;

import java.util.Random;

public class Square extends Figure {
    private double line;
    Square() {
        super();
        Random random = new Random();
        line = random.nextDouble() * 100.0;
    }
    double area() {
        return line * line;
    }
    String getParams() {
        return "line = " + String.format("%.2f", line);
    }
    void draw() {
        System.out.println("Draw a Square.");
    }
}
