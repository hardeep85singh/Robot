package bookCar;

public class VehicleImpl implements Vehicle{
    Location current;

    public VehicleImpl(Location location){
        current = location;
    }

    @Override
    public Location getCurrentLocation() {
        return current;
    }
}
