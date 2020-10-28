package ru.stqa.pft.sandbox;

public class hello {
  public static void main(String[] args) {
    hello("world");
    hello("user");

    Square s = new Square(5);
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4, 6);
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

    Point p1 = new Point(2,3);
    Point p2 = new Point(4,5);
    System.out.println("Расстояние между двумя точками (" + p1.x + "," + p1.y + ")" + " и " + "(" + p2.x + "," + p2.y + ")" + " = " + p1.distance(p2));


    Point p3 = new Point(15,27);
    Point p4 = new Point(36,84);
    System.out.println("Расстояние между двумя точками (" + p3.x + "," + p3.y + ")" + " и " + "(" + p4.x + "," + p4.y + ")" + " = " + p3.distance(p4));

  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }

}