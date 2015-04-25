public class ResourceStack {

    private int[] quantity,
                  maximum;

    public ResourceStack() {
        //Creates a new empty resource stack
        quantity = new int[] {0,0,0,0};
    }

    public ResourceStack(int[] quantities, int[] maxima) {
        quantity = quantities;
        maximum = maxima;
    }

    /*
    public ResourceStack(int initialQuantity, ResourceType flavor) {
        //Creates a new resource stack containing initialQuantity
        quantity = initialQuantity;

        //If the resource is uranium it follows this cost progression
        if (flavor.isCompatible("Uranium")) {
            costProgression = new int[]
                    {16, 14, 12, 10, 8, 7, 6, 5, 4, 3, 2, 1};
        }
        //Otherwise it follows this cost progression
        else {
            costProgression = new int[]
                    {8, 8, 8, 7, 7, 7, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 2, 2, 2, 1, 1, 1};
        }
        type = flavor;
    }
    */

/*
    public int cost(int numberDesired, Player buyer) {
        if (numberDesired <= quantity) {
            //Checks to make sure there is enough resource

            int totalCost = 0,
                i = 0;

            while (i < numberDesired &
                    //Checks to make sure the current amount is less than the desired amount

                    (totalCost + costProgression[quantity - i - 1] <= buyer.getElektro()) &
                    //Checks that the player will have enough money for this purchase

                    (i < buyer.getPowerPlant()[1].getResourceConsumption() * 2)) {
                    //Checks that there is enough room for the resource

                totalCost += costProgression[quantity - i];
                //Adds the cost at the current index

                i++;
            }
            return totalCost;
        }
        else return 0;
    }
    */

    public int getQuantity(int type) {
        return quantity[type];
    }

    public void changeQuantity(int[] change) {
        for (int i = 0; i < 3; i++) {
            quantity[i] += change[i];
        }
        ensureReasonableQuantity();
    }
    
    public void changeQuantity(int change, int type) {
    	quantity[type] += change;
    	ensureReasonableQuantity();
    }
    
    private void ensureReasonableQuantity() {
    	//Makes sure the quantity never goes above the maximum nor below zero
    	for (int i = 0; i < 3; i++) {
    		if (quantity[i] > maximum[i]) {
                quantity[i] = maximum[i];
            }
            else if (quantity[i] < 0) {
            	quantity[i] = 0;
            }
    	}
    }

    public int[] getQuantity() {
        return quantity;
    }

    public int getCoal() {
        return quantity[0];
    }

    public int getOil() {
        return quantity[1];
    }

    public int getGarbage() {
        return quantity[2];
    }

    public int getUranium() {
        return quantity[3];
    }
}
