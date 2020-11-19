package locationHistory;

public class LocationHistoryImplDriver {
    public static void main(String[]args){
        LocationHistory locationHistory = new LocationHistoryImpl();

        locationHistory.setCurrentLocation(new Location(1,1));

        locationHistory.setCurrentLocation(new Location(2,2));


    }
}
