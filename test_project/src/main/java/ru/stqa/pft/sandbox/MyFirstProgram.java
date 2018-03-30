package ru.stqa.pft.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
        hello("world");
        hello("user");
        hello("Alexei");

        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(4, 6);
        System.out.println("Площадь прямоугольник со сторонами " + r.a + " and " + r.b + " = " + r.area());

        Point p1 = new Point(2, 3);
        Point p2 = new Point(5, 2);
        System.out.println("Distance between 2 points equal to: " + distance(p1, p2));
    }

    private static void hello(String somebody) {
        System.out.println("Hello " + somebody + "!");
    }

    public static double distance(Point p1, Point p2){
        return Math.sqrt((p2.x - p1.x)*(p2.x - p1.x) + (p2.y - p1.y)*(p2.y - p1.y));
    }
}