package prep.interview.architect.pakinglot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLot {
    private final List<ParkingSpot> spots = new ArrayList<>();
    private final Map<String, ParkingSpot> vehicleSpotMap = new HashMap<>();

    public ParkingLot(int small, int medium, int large) {
        int id = 1;
        for (int i = 0; i < small; i++)
            spots.add(new ParkingSpot(id++, SpotType.SMALL));
        for (int i = 0; i < medium; i++)
            spots.add(new ParkingSpot(id++, SpotType.MEDIUM));
        for (int i = 0; i < large; i++)
            spots.add(new ParkingSpot(id++, SpotType.LARGE));
    }

    public synchronized boolean parkVehicle(Vehicle vehicle) {
        for (ParkingSpot spot : spots) {
            if (spot.isFree() && spot.canFitVehicle(vehicle)) {
                spot.park(vehicle);
                vehicleSpotMap.put(vehicle.getLicensePlate(), spot);
                System.out.println("Parked at spot: " + spot.getSpotId());
                return true;
            }
        }
        System.out.println("No spot available");
        return false;
    }

    public synchronized boolean unparkVehicle(String vehicleNumber) {
        ParkingSpot spot = vehicleSpotMap.get(vehicleNumber);
        if (spot == null) {
            System.out.println("Vehicle not found");
            return false;
        }
        spot.unpark();
        vehicleSpotMap.remove(vehicleNumber);
        System.out.println("Unparked from spot: " + spot.getSpotId());
        return true;
    }
}
