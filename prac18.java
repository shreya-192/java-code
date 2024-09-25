// Rectangle class
class Rectangle {
    double length;
    double breadth;

    // Constructor to initialize length and breadth
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate and print area
    void printArea() {
        double area = length * breadth;
        System.out.println("Area: " + area);
    }

    // Method to calculate and print perimeter
    void printPerimeter() {
        double perimeter = 2 * (length + breadth);
        System.out.println("Perimeter: " + perimeter);
    }
}

// Square class that inherits from Rectangle
class Square extends Rectangle {
    // Constructor for Square, using super to call Rectangle's constructor
    Square(double side) {
        super(side, side); // Calls the Rectangle constructor with side for both length and breadth
    }
}

// Main class to test the functionality
public class prac18 {
    public static void main(String[] args) {
        // Create an array of Rectangle and Square objects
        Rectangle[] shapes = new Rectangle[4];

        // Initialize Rectangle objects
        shapes[0] = new Rectangle(4, 5); // Rectangle
        shapes[1] = new Rectangle(6, 3); // Rectangle

        // Initialize Square objects
        shapes[2] = new Square(4); // Square
        shapes[3] = new Square(5); // Square

        // Print area and perimeter for each shape
        for (Rectangle shape : shapes) {
            shape.printArea();
            shape.printPerimeter();
            System.out.println(); // Print a blank line for separation
           
        }
        System.out.println("23DIT052 SHREYA PATEL");
    }
}

