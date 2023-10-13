public class Demo {
    public static void main(String[] args) {
        Shape S = new Shape("Red", true);
        Circle C = new Circle(5.0);
        Circle C1 = new Circle(5.0, "blue", true);
        Rectangle R = new Rectangle(2.0, 3.0);
        Rectangle R1 = new Rectangle(2.0, 3.0, "green", false);
        Square Sq = new Square(4.0);
        Square Sq1 = new Square(4.0);

        System.out.println(S.toString());
        System.out.println("Circle C: " + C.toString());
        System.out.println("C.getArea() = " + C.getArea());
        System.out.println("C.getPerimeter() = " + C.getPerimeter());

        System.out.println("Circle C1: " + C1.toString());
        System.out.println("C1.getArea() = " + C1.getArea());
        System.out.println("C1.getPerimeter() = " + C1.getPerimeter());

        System.out.println("Rectangle R: " + R.toString());
        System.out.println("R.getArea() = " + R.getArea());
        System.out.println("R.getPerimeter() = " + R.getPerimeter());

        System.out.println("Rectangle R1: " + R1.toString());
        System.out.println("R1.getArea() = " + R1.getArea());
        System.out.println("R1.getPerimeter() = " + R1.getPerimeter());

        System.out.println("Square Sq: " + Sq.toString());
        System.out.println("Sq.getArea() = " + Sq.getArea());
        System.out.println("Sq.getPerimeter() = " + Sq.getPerimeter());

        System.out.println("Square Sq1: " + Sq1.toString());
        System.out.println("Sq1.getArea() = " + Sq1.getArea());
        System.out.println("Sq1.getPerimeter() = " + Sq1.getPerimeter());
    }
}
