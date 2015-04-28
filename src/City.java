
public class City {
	private String name,
				   region;
	private City[] connections;
	private int[] connectionCosts;
	
	public City(String name, String region) {
		this.name = name;
		this.region = region;
	}
	
	public void addNeighbors(City[] neighborCities, int[] neighborCosts) {
		connections = neighborCities;
		connectionCosts = neighborCosts;
	}
}
