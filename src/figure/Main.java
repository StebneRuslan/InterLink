package figure;

import java.util.Random;

public class Main {
    private Figure[] figures;

    private Figure randomFigure() {
        Figure newRandomFigure = new Square();
        Random random = new Random();
        int value = random.nextInt(2);
        switch (value){
            case 1:
                newRandomFigure = new Circle();
                break;
        }
        return newRandomFigure;
    }

    Main(int figureCount) {
        figures = new Figure[figureCount];
        for (int i = 0; i < figureCount; i++){
            figures[i] = randomFigure();
        }
    }

    public  void printAll() {
        for(Figure i : figures) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Main main = new Main(5);
        main.printAll();
    }
}
