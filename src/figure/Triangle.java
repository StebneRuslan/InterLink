package figure;

import java.awt.*;

public class Triangle extends Figure {
    private double a, b, c;

    public Triangle(double a, double b, double c, Color color){
        super.setColor(color);
        this.a = a;
        this.b = b;
        this.c = c;
        if((a <= 0) || (b <= 0) || (c <= 0)) {
            throw new IllegalArgumentException("Side cannot be negative. ");
        }
        else if (!validation.sidesInequality(a, b, c)){
            throw new IllegalArgumentException("The triangle is incorrect. ");
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

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setSides(double a, double b, double c) {

        if (!validation.sideValidation((a)) || !validation.sideValidation(b) || !validation.sideValidation(c)) {
            throw new IllegalArgumentException("Side cannot be negative. ");
        }else if (!validation.sidesInequality(a, b, c)){
            throw new IllegalArgumentException("The triangle is incorrect. ");
        }
        else {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
}
