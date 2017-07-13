package figure;

/**
 * Created by ruslan on 13.07.17.
 */
public class Validation {
    public boolean sidesInequality(double a, double b, double c){
        if( c <= (a + b)) {
            return true;
        }
        else {
            return false;
        }
    }
}
