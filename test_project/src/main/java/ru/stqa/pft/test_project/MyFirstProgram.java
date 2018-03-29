package ru.stqa.pft.test_project;

public class MyFirstProgram {
    public static void main(String[] args) {
        hello("world");
        hello("user");
        hello("Alexei");

        double l = 5;
        System.out.println("Площадь квадрата со стороной " + l + " = " + area(l));
    }

    private static void hello(String somebody) {
        System.out.println("Hello " + somebody + "!");
    }

    public static double area(double l){
        return l * l;
    }
}