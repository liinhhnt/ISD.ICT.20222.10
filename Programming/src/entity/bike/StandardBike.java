package entity.bike;

public class StandardBike extends Bike {

    public static final int BIKE_TYPE_VALUE = 1;

    public StandardBike() {
        super();
    }
    
    public StandardBike(String bikeId, int type, String barCode, String licensePlate, float value, boolean isBeingUsed,
			int rearSeats, int pedals, int saddles, String imgUrl) {
        super(bikeId, type, barCode, licensePlate, value, isBeingUsed, rearSeats, pedals, saddles, imgUrl);
    }

}