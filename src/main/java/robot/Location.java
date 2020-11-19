package robot;

import java.awt.*;

public class Location extends Point {
    private double x;
    private double y;

    public Location(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public String toString(){
        return String.format("%s%.2f%s%.2f%s%n", "Location: (", this.x, " ,", this.y, " )");
    }
}
