package prep.interview.architect.pakinglot;

import static prep.interview.architect.pakinglot.VehicleType.*;

public class ParkingSpot {

    private final int spotId;
    private final SpotType spotType;
    private Vehicle parkedVehicle;

    public ParkingSpot(int spotId, SpotType spotType) {
        this.spotId = spotId;
        this.spotType = spotType;
    }

    public boolean isFree() {
        return parkedVehicle == null;
    }

    public boolean canFitVehicle(Vehicle vehicle) {
        return switch (vehicle.getVehicleType()) {
            case BIKE -> true;
            case CAR -> spotType != SpotType.SMALL;
            case TRUCK -> spotType == SpotType.LARGE;
        };
    }

    public void park(Vehicle vehicle) {
        this.parkedVehicle = vehicle;
    }

    public void unpark() {
        this.parkedVehicle = null;
    }

    public int getSpotId() {
        return spotId;
    }
}
