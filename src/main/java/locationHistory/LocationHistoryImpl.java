package locationHistory;

import org.joda.time.DateTime;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class LocationHistoryImpl implements LocationHistory {
    private Map<Date, Location> locations = new HashMap<>();
    private Location currentLocation;


    public LocationHistoryImpl() {
        currentLocation = new Location(0, 0);
    }

    @Override
    public void setCurrentLocation(Location location) {
        Date currentTime = new Date();
        locations.put(currentTime, location);
    }

    @Override
    public Map<Date, Location> lastMonthLocations() {
        Map<Date, Location> previousMonthLocations = new HashMap<>();

        for (Date date : locations.keySet()) {
            if (dateWithInLastMonth(date)) {
                previousMonthLocations.put(date, locations.get(date));
            }
        }
        return previousMonthLocations;
    }

    @Override
    public Location getLocation(Date date) {
        Location location = locations.get(date);
        return location;
    }

    private boolean dateWithInLastMonth(Date date) {
        DateTime dt = new DateTime(date);
        int lastMonth = dt.getMonthOfYear();

        DateTime current = new DateTime();
        int currentMonth = current.getMonthOfYear();

        if (currentMonth == lastMonth + 1) {
            return true;
        } else {
            return false;
        }
    }
}
