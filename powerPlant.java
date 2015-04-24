package goatsoft.powergrid;

/**
 * Created by Jaime on 4/23/2015.
 */
public class powerPlant {

    //The number on the card. Determines the minimum bid at auction and obsolescence
    private int number,

    //Resources needed to operate. Determines resource capacity
        resourceConsumption,

    //Power generated in operation
        powerOutput;

    //Type of resource it burns
    private String resourceType;


    public powerPlant(int n, int consumption, int output, String resource) {
        //Takes input (number, resourceConsumption, powerOutput, resourceType)
        number = n;
        resourceConsumption = consumption;
        powerOutput = output;
        resourceType = resource;
    }

    public int generate(int n, String resource) {
        //Takes input (resources available, resource name)
        if (resource.equals(resourceType) & n >= resourceConsumption) {
            return powerOutput;
        }
        else return 0;
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
