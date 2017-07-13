package figure;

public class Validation {
    public boolean sidesInequality(double a, double b, double c){
        return c <= (a + b);
    }

    public boolean sideValidation(double side){
        return !(side <= 0);
    }
}
