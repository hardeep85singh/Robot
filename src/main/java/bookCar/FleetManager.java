package bookCar;

import java.util.List;
import java.util.Map;

public interface FleetManager {

    /**
     * Vehicle to be added in the fleet
     * @param vehicle details to be added
     * @return the vehicles data
     */
    Map<String, Vehicle> registerVehicle(Vehicle vehicle);

    /**
     * Vehicle to be searched within a radius from a location & will return drivers details
     * @param location gets the source location of the user
     * @param radius of the search from th source location
     * @return drivers within the area
     */
    List<Driver> searchVehicle(Location location, int radius);

    /**
     * asks the drivers if they are interested
     * @param drivers that are returned after searching
     * @return true if interested
     */
    boolean areYouInterested(List<Driver> drivers);

}
