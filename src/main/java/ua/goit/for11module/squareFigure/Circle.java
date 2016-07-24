package ua.goit.for11module.squareFigure;

class Circle extends GeometricFigure {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String getFigureType() {
        return "Circle";
    }

    @Override
    public String getInitialParams() {
        return "radius of square: ";
    }

    @Override
    public double calculate() {
        return Math.PI * radius * radius;
    }
}

