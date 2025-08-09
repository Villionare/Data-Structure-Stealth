package com.DsaPlaylist.Assignments;

import java.util.Scanner;

public class AreasAndParameters {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                // Menu
                System.out.println("\nChoose an option:");
                System.out.println("1. Area of Circle");
                System.out.println("2. Area of Triangle");
                System.out.println("3. Area of Rectangle");
                System.out.println("4. Area of Isosceles Triangle");
                System.out.println("5. Area of Parallelogram");
                System.out.println("6. Area of Rhombus");
                System.out.println("7. Area of Equilateral Triangle");
                System.out.println("8. Perimeter of Circle");
                System.out.println("9. Perimeter of Equilateral Triangle");
                System.out.println("10. Perimeter of Parallelogram");
                System.out.println("11. Perimeter of Rectangle");
                System.out.println("12. Perimeter of Square");
                System.out.println("13. Perimeter of Rhombus");
                System.out.println("14. Volume of Cone");
                System.out.println("15. Volume of Prism");
                System.out.println("16. Volume of Cylinder");
                System.out.println("17. Volume of Sphere");
                System.out.println("18. Volume of Pyramid");
                System.out.println("19. Curved Surface Area of Cylinder");
                System.out.println("20. Total Surface Area of Cube");
                System.out.println("0. Exit");

                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                double result;

                switch (choice) {
                    case 1 -> { // Area of Circle
                        System.out.print("Enter radius: ");
                        double r = scanner.nextDouble();
                        result = Math.PI * r * r;
                        System.out.println("Area of Circle = " + result);
                    }
                    case 2 -> { // Area of Triangle
                        System.out.print("Enter base: ");
                        double b = scanner.nextDouble();
                        System.out.print("Enter height: ");
                        double h = scanner.nextDouble();
                        result = 0.5 * b * h;
                        System.out.println("Area of Triangle = " + result);
                    }
                    case 3 -> { // Area of Rectangle
                        System.out.print("Enter length: ");
                        double l = scanner.nextDouble();
                        System.out.print("Enter width: ");
                        double w = scanner.nextDouble();
                        result = l * w;
                        System.out.println("Area of Rectangle = " + result);
                    }
                    case 4 -> { // Area of Isosceles Triangle
                        System.out.print("Enter base: ");
                        double b = scanner.nextDouble();
                        System.out.print("Enter height: ");
                        double h = scanner.nextDouble();
                        result = 0.5 * b * h;
                        System.out.println("Area of Isosceles Triangle = " + result);
                    }
                    case 5 -> { // Area of Parallelogram
                        System.out.print("Enter base: ");
                        double b = scanner.nextDouble();
                        System.out.print("Enter height: ");
                        double h = scanner.nextDouble();
                        result = b * h;
                        System.out.println("Area of Parallelogram = " + result);
                    }
                    case 6 -> { // Area of Rhombus
                        System.out.print("Enter diagonal1: ");
                        double d1 = scanner.nextDouble();
                        System.out.print("Enter diagonal2: ");
                        double d2 = scanner.nextDouble();
                        result = (d1 * d2) / 2;
                        System.out.println("Area of Rhombus = " + result);
                    }
                    case 7 -> { // Area of Equilateral Triangle
                        System.out.print("Enter side: ");
                        double a = scanner.nextDouble();
                        result = (Math.sqrt(3) / 4) * a * a;
                        System.out.println("Area of Equilateral Triangle = " + result);
                    }
                    case 8 -> { // Perimeter of Circle
                        System.out.print("Enter radius: ");
                        double r = scanner.nextDouble();
                        result = 2 * Math.PI * r;
                        System.out.println("Perimeter of Circle = " + result);
                    }
                    case 9 -> { // Perimeter of Equilateral Triangle
                        System.out.print("Enter side: ");
                        double a = scanner.nextDouble();
                        result = 3 * a;
                        System.out.println("Perimeter of Equilateral Triangle = " + result);
                    }
                    case 10 -> { // Perimeter of Parallelogram
                        System.out.print("Enter base: ");
                        double b = scanner.nextDouble();
                        System.out.print("Enter side: ");
                        double s = scanner.nextDouble();
                        result = 2 * (b + s);
                        System.out.println("Perimeter of Parallelogram = " + result);
                    }
                    case 11 -> { // Perimeter of Rectangle
                        System.out.print("Enter length: ");
                        double l = scanner.nextDouble();
                        System.out.print("Enter width: ");
                        double w = scanner.nextDouble();
                        result = 2 * (l + w);
                        System.out.println("Perimeter of Rectangle = " + result);
                    }
                    case 12 -> { // Perimeter of Square
                        System.out.print("Enter side: ");
                        double a = scanner.nextDouble();
                        result = 4 * a;
                        System.out.println("Perimeter of Square = " + result);
                    }
                    case 13 -> { // Perimeter of Rhombus
                        System.out.print("Enter side: ");
                        double a = scanner.nextDouble();
                        result = 4 * a;
                        System.out.println("Perimeter of Rhombus = " + result);
                    }
                    case 14 -> { // Volume of Cone
                        System.out.print("Enter radius: ");
                        double r = scanner.nextDouble();
                        System.out.print("Enter height: ");
                        double h = scanner.nextDouble();
                        result = (Math.PI * r * r * h) / 3;
                        System.out.println("Volume of Cone = " + result);
                    }
                    case 15 -> { // Volume of Prism
                        System.out.print("Enter base area: ");
                        double baseArea = scanner.nextDouble();
                        System.out.print("Enter height: ");
                        double h = scanner.nextDouble();
                        result = baseArea * h;
                        System.out.println("Volume of Prism = " + result);
                    }
                    case 16 -> { // Volume of Cylinder
                        System.out.print("Enter radius: ");
                        double r = scanner.nextDouble();
                        System.out.print("Enter height: ");
                        double h = scanner.nextDouble();
                        result = Math.PI * r * r * h;
                        System.out.println("Volume of Cylinder = " + result);
                    }
                    case 17 -> { // Volume of Sphere
                        System.out.print("Enter radius: ");
                        double r = scanner.nextDouble();
                        result = (4.0 / 3.0) * Math.PI * r * r * r;
                        System.out.println("Volume of Sphere = " + result);
                    }
                    case 18 -> { // Volume of Pyramid
                        System.out.print("Enter base area: ");
                        double baseArea = scanner.nextDouble();
                        System.out.print("Enter height: ");
                        double h = scanner.nextDouble();
                        result = (baseArea * h) / 3;
                        System.out.println("Volume of Pyramid = " + result);
                    }
                    case 19 -> { // Curved Surface Area of Cylinder
                        System.out.print("Enter radius: ");
                        double r = scanner.nextDouble();
                        System.out.print("Enter height: ");
                        double h = scanner.nextDouble();
                        result = 2 * Math.PI * r * h;
                        System.out.println("Curved Surface Area of Cylinder = " + result);
                    }
                    case 20 -> { // Total Surface Area of Cube
                        System.out.print("Enter side: ");
                        double a = scanner.nextDouble();
                        result = 6 * a * a;
                        System.out.println("Total Surface Area of Cube = " + result);
                    }
                    case 0 -> {
                        System.out.println("Exiting program...");
                        return;
                    }
                    default -> System.out.println("Invalid choice! Please try again.");
                }
            }
        }
    }

