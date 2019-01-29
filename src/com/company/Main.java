package com.company;

public class Main
{
    public static void main(String[] args)
    {
        Triangle triangle1 = new Triangle();
        triangle1.sideA = 4;
        triangle1.sideB = 4;
        triangle1.sideC = 4;
        printTriangleSummary(triangle1);

        Triangle triangle2 = new Triangle();
        triangle2.sideA = 3;
        triangle2.sideB = 5;
        triangle2.sideC = 8;
        printTriangleSummary(triangle2);

        Triangle triangle3 = new Triangle();
        triangle3.sideA = 6;
        triangle3.sideB = 6;
        triangle3.sideC = 4;
        printTriangleSummary(triangle3);

        Triangle triangle4 = new Triangle();
        triangle4.sideA = 3;
        triangle4.sideB = 4;
        triangle4.sideC = 5;
        printTriangleSummary(triangle4);
    }

    private static void printTriangleSummary(Triangle triangle)
    {
        System.out.println("Side A: " + triangle.sideA + "\nSide B: " + triangle.sideB + "\nSide C: " + triangle.sideC);
        System.out.println("Perimeter: " + triangle.getPerimeter() + "\nEquilateral? " + triangle.isEquilateral());
        System.out.println("Isosceles? " + triangle.isIsosceles() + "\nScalene? " + triangle.isScalene());
        System.out.println("Right? " + triangle.isRightAngle() + "\nAcute? " + triangle.isAcute() + "\nObtuse? " + triangle.isObtuse());
    }
}
