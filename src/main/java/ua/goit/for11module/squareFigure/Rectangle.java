package ua.goit.for11module.squareFigure;

public class Rectangle extends GeometricFigure{
    private double length;
    private double height;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeightR(double height) {
        this.height = height;
    }

    @Override
    public String getFigureType() {
        return "Rectangle";
    }

    @Override
    public String getInitialParams() {
        return "length and height of rectangle: ";
    }

    @Override
    public double calculate() {
        return length * height;
    }
}

