/*Test 2
use your code from the first test and:

1) extend the class vehicle by making two new classes motorcycle and car
   the functions/methods `distanceKmPerL()` and `fuelUsageLPer100Km()` should also work
   with objects of the class motorcycle and car
   (1 point)

2) on object creation the `car` class has to set `noOfSeats` automatically to 5
   and the `motorcycle` class has to set `noOfSeats` automatically to 2
   (2 points)

3) create a function called `steering()` this function has to set `actionToSteer`
   of the vehicle class to "lean over" for vehicles of the class `motorcycle`
   and to "rotate steering wheel" for vehicles of the class `car`
   (3 points)
*/

class vehicle {
	private int traveledDistance;
	private int fuelUsed;
	protected int noOfSeats;
	private String actionToSteer; // e.g. "lean over" or "rotate steering wheel"

	/**
	 * @param int traveledDistance distance in km
	 * @param int fuelUsed fuel used in liters
	 */
	public vehicle(int traveledDistance, int fuelUsed, int noOfSeats, String actionToSteer) {
		this.traveledDistance = traveledDistance;
		this.fuelUsed = fuelUsed;
		this.noOfSeats = noOfSeats;
		this.actionToSteer = actionToSteer;
	}

	public float distanceKmPerL() {
		return traveledDistance / fuelUsed;
	}

	public float fuelUsageLPer100Km() {
		return 100 / (traveledDistance / fuelUsed);
	}

	public String steering() {
		return actionToSteer;
	}

	public int noOfSeats() {
		return noOfSeats;
	}
};

class motorcycle extends vehicle {
	public motorcycle(int traveledDistance, int fuelUsed) {
		super(traveledDistance, fuelUsed, 2, "lean over");
	}

}

class car extends vehicle {
	public car(int traveledDistance, int fuelUsed) {
		super(traveledDistance, fuelUsed, 5, "rotate steering wheel");
	}

}

public class javaProgram2 {
	public static void main(String args[]) {
		motorcycle royalEnfield = new motorcycle(600, 25);
		System.out.println("Royal Enfield kilometres per liter: " + royalEnfield.distanceKmPerL());
		System.out.println("Royal Enfield fuel usage per 100km: " + royalEnfield.fuelUsageLPer100Km());
		System.out.println("Royal Enfield steering: " + royalEnfield.steering() + " & number of seats : "
				+ royalEnfield.noOfSeats());

		motorcycle pulsar = new motorcycle(450, 15);
		System.out.println("Pulsar kilometres per liter: " + pulsar.distanceKmPerL());
		System.out.println("Pulsar fuel usage per 100km: " + pulsar.fuelUsageLPer100Km());
		System.out
				.println("Royal Enfield steering: " + pulsar.steering() + " & number of seats : " + pulsar.noOfSeats());

		car hondaCivic = new car(400, 35);
		System.out.println("Honda Civic kilometres per liter: " + hondaCivic.distanceKmPerL());
		System.out.println("Honda Civic fuel usage per 100km: " + hondaCivic.fuelUsageLPer100Km());
		System.out.println(
				"Royal Enfield steering: " + hondaCivic.steering() + " & number of seats : " + hondaCivic.noOfSeats());
	}
}
