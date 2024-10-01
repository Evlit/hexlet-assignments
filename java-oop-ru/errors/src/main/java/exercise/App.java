package exercise;

// BEGIN
public class App {
    public static void printSquare(Circle circle) {
        try {
            System.out.println((int) Math.round(circle.getSquare()));
        } catch (NegativeRadiusException e) {
            System.out.println(e.toString());
        } finally {
            System.out.println("Вычисление окончено");
        }
    }
}
// END
