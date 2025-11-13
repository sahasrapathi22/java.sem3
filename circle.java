public class circle {
    static class Shape {
        void displayShape() {
            System.out.println("This is a shape.");
        }
    }

    static class Circle extends Shape {
        private double radius;
        Circle(double radius) { this.radius = radius; }
        double area() { return Math.PI * radius * radius; }
        @Override
        void displayShape() { System.out.println("This is a circle."); }
    }

    static class Rectangle extends Shape {
        private double width, height;
        Rectangle(double width, double height) { this.width = width; this.height = height; }
        double area() { return width * height; }
        @Override
        void displayShape() { System.out.println("This is a rectangle."); }
    }

    public static void main(String[] args) {
        Circle c = new Circle(5.0);
        Rectangle r = new Rectangle(4.0, 6.0);

        c.displayShape();
        System.out.println("Circle area: " + c.area());

        r.displayShape();
        System.out.println("Rectangle area: " + r.area());
    }
}
