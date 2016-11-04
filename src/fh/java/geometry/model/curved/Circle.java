package fh.java.geometry.model.curved;

public class Circle extends CurvedShape {

    private double radius;

    public Circle(int x, int y,double radius) {
        this.x=x;       //x and y are available because they are declared as 'protected' in the GeometricShape class
        this.y=y;       //so all subclasses are allowed to use them
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //Alt + Enter (while cursor is on 'extends')
    @Override
    public double calcArea() {
        return Math.PI * radius*radius;
    }
    @Override
    public double calcPerimeter() {
        return Math.PI * 2 * radius;
    }

    // TODO: Implement equals() and hashCode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Circle circle = (Circle) o;

        return Double.compare(circle.radius, radius) == 0;
    }
    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(radius);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Circle{");
        sb.append("radius=").append(radius);
        sb.append(", area=").append(calcArea());
        sb.append(", perimeter=").append(calcPerimeter());

        sb.append('}');
        return sb.toString();
    }
}
