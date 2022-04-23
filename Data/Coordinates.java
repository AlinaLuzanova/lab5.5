package Data;

public class Coordinates {

    private Float x; // поле не может быть null, max value = 754
    private Float y;
    private static Float max_x = Float.valueOf(754);

    public Coordinates(Float x, Float y) {
        this.x = x;
        this.y = y;
    }

    public static boolean checkValidX(Float x) {
        if (x > max_x) return false;
        return true;
    }

    public static Float getMaxX(int i) {
        return max_x;
    }

    public Float getX() {
        return x;
    }

    public Float getY() {
        return y;
    }

    @Override
    public String toString() {
        return "x = " + x + ", y = " + y;
    }

}