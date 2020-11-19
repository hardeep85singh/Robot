package locationHistory;

public class Location {
    private int x;
    private int y;

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String toString() {
        return String.format("%s%d%s%d%s%n", "Location: (", this.x, " ,", this.y, " )");
    }
}
