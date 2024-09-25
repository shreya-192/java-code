// Parent class
class Parent {
    void display() {
        System.out.println("This is parent class");
    }
}

// Child class that extends Parent
class Child extends Parent {
    void show() {
        System.out.println("This is child class");
    }
}
public class prac16 {
    public static void main(String[] args) {
        
        Parent parentObj = new Parent();
        parentObj.display();

       
        Child childObj = new Child();
        childObj.show();
        childObj.display(); 
    }
}