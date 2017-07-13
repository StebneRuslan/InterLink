package figure;

import java.awt.*;

/**
 * Created by ruslan on 11.07.17.
 */
public class Main {
    public static void main(String[] args) {
        try {
            Square square = new Square(10, Color.black);
            square.area();

            square.setSide(-5);
            square.area();

            Circle circle = new Circle(10, Color.black);
            circle.area();
            circle.setRadius(-2);

            circle.area();

            Triangle triangle = new Triangle(5, 1, 5,  Color.blue);
            triangle.area();

            circle.area();
        }catch (IllegalArgumentException ex){
            System.out.println(ex.fillInStackTrace());
        }
    }
}
