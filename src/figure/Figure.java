package figure;

import java.awt.*;

/**
 * Created by ruslan on 11.07.17.
 */
abstract class Figure {

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
