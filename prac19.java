class shape {
    public void printShape()
    {
        System.out.println("This is shape.");
    }
}
class Rectangle extends shape{
    public void printRectangle()
    {
        System.out.println("This is rectangular shape.");
    }
}

class Circle extends shape{
    public void printCircle()
    {
        System.out.println("This is circular shape.");
    }
}

class Square extends Rectangle{
    public void printSquare()
    {
        System.out.println("Square is a rectangle");
    }
}

public class prac19{

    public static void main(String[] args) {

        shape S = new shape();
        Rectangle r = new Rectangle();
        Circle c = new Circle();
        Square s = new Square();

        S.printShape();
        r.printRectangle();
        s.printSquare();
        c.printCircle();

        System.out.println("\nCalling  method of Shape and Rectangle by Square object ");
        s.printShape();
        s.printRectangle();

        System.out.println("23DIT052");
    }

}