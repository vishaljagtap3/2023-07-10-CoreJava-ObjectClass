public class Pixel extends Object{
    private int x;
    private int y;

    public Pixel(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw() {
        System.out.println("x = " + x  + " y = " + y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    /*@Override
    public String toString() {
        return "Pixel: x = " + x  + " y = " + y;
    }*/

    @Override
    public boolean equals(Object o) {
        Pixel pixel = (Pixel) o;

        if (x != pixel.x)
            return false;

        return y == pixel.y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }
}
