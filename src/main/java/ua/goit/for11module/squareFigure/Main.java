package ua.goit.for11module.squareFigure;

import java.io.IOException;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws IOException {
        ShapeUtil.programBegin();
        String[] split;

        try {
            String figure = ShapeUtil.READER.readLine();
            ua.goit.for11module.squareFigure.Enum.Figure enumFigure = ua.goit.for11module.squareFigure.Enum.Figure.valueOf(figure);

            switch (enumFigure) {
                case Circle:
                    Circle circle = new Circle();
                    split = readParams(circle);

                    Double radius = Double.parseDouble(split[0]);

                    circle.setRadius(radius);
                    double squareC = circle.calculate();

                    System.out.println(squareC);
                    break;

                case Triangle:
                    Triangle triangle = new Triangle();
                    split = readParams(triangle);

                    Double height = Double.parseDouble(split[0]);
                    Double base = Double.parseDouble(split[1]);

                    triangle.setHeight(height);
                    triangle.setBase(base);
                    double squareT = triangle.calculate();

                    System.out.println(squareT);
                    break;

                case Rectangle:
                    Rectangle rectangle = new Rectangle();
                    split = readParams(rectangle);

                    Double heightR = Double.parseDouble(split[0]);
                    Double length = Double.parseDouble(split[1]);

                    rectangle.setHeightR(heightR);
                    rectangle.setLength(length);
                    double squareR = rectangle.calculate();

                    System.out.println(squareR);
                    break;

                case Out:
                    System.exit(1);
            }

        } catch (NumberFormatException ex) {
            System.out.println("You enter string value, must be number!");
        }
    }

    private static String[] readParams(GeometricFigure figure) throws IOException {
        System.out.println(figure);
        String inputForGeometricFigure = ShapeUtil.READER.readLine();

        return inputForGeometricFigure.split(",");
    }
}
