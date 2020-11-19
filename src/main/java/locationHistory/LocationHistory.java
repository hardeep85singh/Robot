package locationHistory;

import java.util.Date;
import java.util.Map;

public interface LocationHistory {

    void setCurrentLocation (Location location);

    Map<Date, Location> lastMonthLocations();

    Location getLocation(Date date);
}
