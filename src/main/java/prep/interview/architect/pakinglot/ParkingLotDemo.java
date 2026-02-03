package prep.interview.architect.pakinglot;

public class ParkingLotDemo {
    public static void main(String[] args) {

        ParkingLot lot = new ParkingLot(1, 1, 1);

        Vehicle car = new Vehicle("KA01AB1234", VehicleType.CAR);
        Vehicle bike = new Vehicle("KA02XY5678", VehicleType.BIKE);
        Vehicle truck = new Vehicle("KA03TR9999", VehicleType.TRUCK);

        lot.parkVehicle(car);
        lot.parkVehicle(bike);
        lot.parkVehicle(truck);

        lot.unparkVehicle(car.getLicensePlate());
    }
}
