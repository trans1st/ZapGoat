
public class City {
	private String name,
				   regionName;
	private City[] connections;
	private int[] connectionCosts;
	
	public City(String cityName, String region) {
		name = cityName;
		regionName = region;
	}
	
	public void addNeighbors(City[] neighborCities, int[] neighborCosts) {
		connections = neighborCities;
		connectionCosts = neighborCosts;
	}
}
