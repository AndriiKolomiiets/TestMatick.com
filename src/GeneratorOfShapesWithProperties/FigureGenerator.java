package GeneratorOfShapesWithProperties;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class FigureGenerator {
    private static int numberOfFigures;
    private static int numberOfElements;
    private static List<Figure> listOfFigures;
    private static List<Figure> startListOfFigures;

    public static void main(String[] args) {
        getNumberOfElements();
        getRandomListOfFigures();
        printRandomListOfFigures();
        printTheListOfAllFigures();
    }

    public static int getNumberOfElements() {
        Random random = new Random();
        return numberOfElements = random.nextInt(3) + 1;
    }

    public static void getRandomListOfFigures() {
        startListOfFigures = Arrays.asList(new Triangle(), new Circle(), new Square(), new Trapezium());
        Collections.shuffle(startListOfFigures);
        listOfFigures = startListOfFigures.subList(0, numberOfElements);
    }

    public static void printRandomListOfFigures() {
        System.out.println(">> Random list of figures:");
        for (Figure figure : listOfFigures) {
            System.out.println(figure);
        }
        System.out.println();
    }

    private static void printTheListOfAllFigures() {
        System.out.println(">> All the figures:");
        for (Figure figure : startListOfFigures) {
            System.out.println(figure);
        }
    }
}
