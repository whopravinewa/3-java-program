// please add to the vehicle class by making 2 new functions/methods that return:
// 1) the kilometers that can be traveled with 1 liter of fuel (1 point)
// 2) the amount of fuel needed to travel 100km (1 point)
class vehicles {
	private int traveledDistance;
	private int fuelUsed;

	/**
	 * @param int traveledDistance distance in km
	 * @param int fuelUsed fuel used in liters
	 */
	public vehicles(int traveledDistance, int fuelUsed) {
		this.traveledDistance = traveledDistance;
		this.fuelUsed = fuelUsed;
	}

	public float distanceKmPerL() {
		return traveledDistance / fuelUsed;
	}
	
	//reusing above method
	public float fuelUsageLPer100Km() {
		return 100 / distanceKmPerL();
	}
};

public class javaProgram1 {
	public static void main(String args[]) {
		vehicles royalEnfield = new vehicles(600, 25);
		System.out.println("Royal Enfield kilometres per liter: " + royalEnfield.distanceKmPerL());
		System.out.println("Royal Enfield fuel usage per 100km: " + royalEnfield.fuelUsageLPer100Km());

		vehicles pulsar = new vehicles(450, 15);
		System.out.println("Pulsar kilometres per liter: " + pulsar.distanceKmPerL());
		System.out.println("Pulsar fuel usage per 100km: " + pulsar.fuelUsageLPer100Km());
	}
}
