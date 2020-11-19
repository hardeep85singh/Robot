package bookCar;

import java.util.List;

public interface BookingManager {

    /**
     * gets the source location from the user
     * @param location source location from the user
     * @return sends location to vehicle fleet to search for vehicle/ driver
     */
    Location getSourceLocation(Location location);

    /**
     * gets the destination location from the user and to be used to calculate distance covered
     * @param location destination location from the user
     * @return location to calculate distance covered/ fare
     */
    Location getDestinationLocation(Location location);

    /**
     * notify user about the booking
     * @param confirmed by the driver
     * @return true if booked
     */
    boolean notifyUser(boolean confirmed);

    /**
     * send driver details
     * @param drivers interested driver from the drivers
     * @param interested if the driver is interested
     * @return the driver details
     */
    Driver driverDetails(List<Driver> drivers, boolean interested);

}
