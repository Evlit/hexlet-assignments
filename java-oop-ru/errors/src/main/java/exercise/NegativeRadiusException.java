package exercise;

// BEGIN
public class NegativeRadiusException extends Exception {
    public String message;

    public NegativeRadiusException() {
    }

    public NegativeRadiusException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Не удалось посчитать площадь";
    }
}
// END
