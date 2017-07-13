package figure;

import java.awt.*;

/**
 * Created by ruslan on 13.07.17.
 */
public class Triangle extends Figure {
    private double a, b, c;
    Validation validation = new Validation();

    public Triangle(double a, double b, double c, Color color){
        super.setColor(color);
        this.a = a;
        this.b = b;
        this.c = c;
        if(a <= 0 || b <= 0 || c <= 0 ) {
            throw new IllegalArgumentException("Side cannot be negative. ");
        }
        else if (validation.sidesInequality(a, b, c) == false){
            throw new IllegalArgumentException("The sum of the lengths of two or three sides of a triangle " +
                    "always exceeds the length of the third side. ");
        }
    }

    private double semiPerimeter(double a, double b, double c){
        return (a + b + c) / 2;
    }

    public double area(){
        double semiperimetr = semiPerimeter(a, b, c);
        return Math.sqrt(semiperimetr * (semiperimetr - a) * (semiperimetr - b) * (semiperimetr - c));
    }

    public void draw(){
        System.out.println("Triangle");
    }

}
