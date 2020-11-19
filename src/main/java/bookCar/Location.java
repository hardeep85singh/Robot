package bookCar;

public class Location {
    private int x;
    private int y;

    public Location(int x, int y){
        this.x =  x;
        this.y = y;
    }

    public Location getLocation(){
        return new Location(this.x, this.y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String toString(){
        return String.format("%s%.2f%s%.2f%s%n", "Location: (", this.x, " ,", this.y, " )");
    }
}
