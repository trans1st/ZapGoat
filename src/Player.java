public class Player {

    private int elektro,
    //Amount of resources player currently has

                numCities;
    //Number of cities currently in player's network.

    private ResourceStack resources;

    public Player() {
        //Starts player with default elektro, cities, and resources
        elektro = 50;
        numCities = 0;
        resources = new ResourceStack();
    }

    public int getElektro() {
        return elektro;
    }

    public void changeElektro(int change) {
        //Adds change to elektro.  Negative amounts subtract elektro
        elektro += change;
    }

    public int getNumCities() {
        return numCities;
    }

    public void addCity() {
        numCities++;
    }
    
}
