public class PowerPlant {

    protected int number,
    //The number on the card. Determines the minimum bid at auction and obsolescence

    resourceConsumption,
    //Resources needed to operate. Determines resource capacity

    powerOutput,
    //Power generated in operation

    resourceType;
    //Type of resource it burns. 0=coal, 1=oil, 2=garbage, 3=uranium, 4=hybrid, 5=green;


    public PowerPlant() {

    }
    
    public PowerPlant(int plantNumber, int plantConsumption, int plantOutput, int plantType){
    	
    }

    public final int generate(ResourceStack fuel) {
    	if (resourceType == 5) {
    		return powerOutput;
    	}
    	else if (resourceType == 4) {
    		//Need some way to decide what kind of fuel to burn in a hybrid situation
    		System.out.println("Bad generation");
    		return powerOutput;
    	}
    	else if (fuel.getQuantity(resourceType) <= resourceConsumption) {
    		fuel.changeQuantity(resourceConsumption, resourceType);
    		return powerOutput;
    	}
    	else {
    		return 0;
    	}
    }

    public final int getNumber() {
        return number;
    }

    public final int getResourceConsumption() {
        return resourceConsumption;
    }

    public final int getPowerOutput() {
        return powerOutput;
    }

    public final int getResourceType () {
        return resourceType;
    }

}