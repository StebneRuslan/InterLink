package figure;

import java.awt.*;
import java.util.Random;

abstract class Figure {
   Color color;

   Figure() {
       Random random = new Random();
       color = new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
   }

   abstract double area();

   abstract String getParams();

   abstract void draw();

    @Override
    public String toString() {
        String label = "" + this.getClass();
        String colorString = "" + color;
        return "Figure: " + label.substring(6).toLowerCase() + "; area = " +
                String.format("%.2f", area()) + "; " +
                getParams() + "; color: " + colorString.substring(14);
    }
}
