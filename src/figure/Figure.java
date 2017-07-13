package figure;

import java.awt.*;

public abstract class Figure {

    public Validation validation = new Validation();

    private Color color;

    abstract void draw();

    abstract double area();

    @Override
    public String toString() {
        return this.getClass() + " Color: " + this.getColor() + ". Area: " + this.area();
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
