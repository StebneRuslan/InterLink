import figure.Circle;
import figure.Figure;
import figure.Square;
import figure.Triangle;

import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            ArrayList<Figure> figures = new ArrayList<>();

            Square square = new Square(10, Color.gray);
            Circle circle = new Circle(5, Color.red);
            Triangle triangle = new Triangle(5, 1, 5,  Color.blue);

            figures.add(square);
            figures.add(circle);
            figures.add(triangle);

            for (Figure figure: figures) {
                System.out.println(figure.toString());
            }

        }catch (IllegalArgumentException ex){
            System.out.println(ex.fillInStackTrace());
        }
    }
}

