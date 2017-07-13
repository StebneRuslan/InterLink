package figure;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        try {
            Square square = new Square(10, Color.black);
            System.out.println("Figure: Color: " + square.getColor() + ". Area: " + square.area());

            Circle circle = new Circle(5, Color.black);
            System.out.println("Figure: Circle. Color: " + circle.getColor() + ". Area: " + circle.area());

            Triangle triangle = new Triangle(5, 1, 5,  Color.blue);
            System.out.println("Figure: Triangle. Color: " + triangle.getColor() + ". Area: " + triangle.area());

        }catch (IllegalArgumentException ex){
            System.out.println(ex.fillInStackTrace());
        }
    }
}

