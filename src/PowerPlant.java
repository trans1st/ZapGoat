public class PowerPlant {

    private int number,
    //The number on the card. Determines the minimum bid at auction and obsolescence

    resourceConsumption,
    //Resources needed to operate. Determines resource capacity

    powerOutput;
    //Power generated in operation

    private String resourceType;
    //Type of resource it burns


    public PowerPlant() {

    }

    public int generate(int numberAvailable, String resourceName) {
        return powerOutput;
    }

    public int getNumber() {
        return number;
    }

    public int getResourceConsumption() {
        return resourceConsumption;
    }

    public int getPowerOutput() {
        return powerOutput;
    }

    public String getResourceType () {
        return resourceType;
    }

}