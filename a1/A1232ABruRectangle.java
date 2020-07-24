package cis232.a1;

// Rectangle

public class A1232ABruRectangle extends Shape {

    private double length;
    private double width;

    public A1232ABruRectangle (double len, double wid) {
        length = len;
        width = wid;
    }

    public double area () {
        return length * width;
    }

    public double perimeter () {
        return 2 * (length + width);
    }

    public String toString () {
        return "Rectangle: " + length + " " + width;
    }

    public double getLength () {
        return length;
    }

    public double getWidth () {
        return width;
    }

    public void stretch (double factor) {

        if (factor <= 0)
            throw new IllegalArgumentException();

        if (length > width)
            length *= factor;
        else
            width *= factor;

    }

}