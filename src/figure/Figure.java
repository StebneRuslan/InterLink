package figure;

import java.awt.*;

abstract class Figure {

    public Validation validation = new Validation();

    private Color color;

    abstract void draw();

    abstract double area();

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
