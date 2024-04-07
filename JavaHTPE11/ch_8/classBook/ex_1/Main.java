package JavaHTPE11.ch_8.classBook.ex_1;

public class Main {
    public static void main(String[] args) {
        Point p = new Point(1, 1);
        Rectangle rect = new Rectangle(100, 200);

        int x = p.getX();
        int y = p.getY();
        p.setX(x + 1);
        p.setY(y + 1);

        rect.move(50, 100);
        int areaOfRectangle = rect.area();
        System.out.println(areaOfRectangle);

        Circle c = new Circle(5.0, 5.0, 2.5);


        // Suit Enum test
        Suit[] suits = Suit.values();
        for (Suit suit : suits) {
            System.out.println(suit.getName());
        }
        System.out.print("");
        System.out.println(Suit.HEARTS);
        System.out.println(Suit.HEARTS.getName());
    }
}
