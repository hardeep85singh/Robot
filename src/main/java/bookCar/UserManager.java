package bookCar;

import java.util.Map;

public interface UserManager {

    /**
     * Add user to the users data
     * @param user user to add
     */
    void addUser(User user);

    /**
     * Get user details from the user data
     * @param userData all users data
     * @return user details
     */
    User getUserDetails(Map<String, User> userData);

    /**
     * enter and get the source location
     * @param location source location , current or user defined
     * @return the source location for booking purpose (fare, distance)
     */
    Location setSourceLocation(Location location);

    /**
     * enter and get the destination location
     * @param location destination location, user defined
     * @return the destination location for booking purpose(Fare, distance )
     */
    Location setDestinationLocation (Location location);

}
