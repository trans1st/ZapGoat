public class ResourceMarket {

    private ResourceStack marketResources;
    public static int[][][] replenishRate = new int[][][] {
            {
                    {3,2,1,1},
                    {4,2,2,1},
                    {3,4,3,1}
            },
            {
                    {4,2,1,1},
                    {5,3,2,1},
                    {3,4,3,1}
            },
            {
                    {5,3,2,1},
                    {6,4,3,2},
                    {4,5,4,2}
            },
            {
                    {5,4,3,2},
                    {7,5,3,3},
                    {5,6,5,2}
            },
            {
                    {7,5,3,2},
                    {9,6,5,3},
                    {6,7,6,3}
            }
    };

    public ResourceMarket() {
        //Sets the values for a typical game start
        marketResources = new ResourceStack(new int[]{24, 18, 6, 2}, new int[]{24, 24, 24, 12, 0});
    }

    public void update() {
        //Updates the resource market at the end of phase 5
        int numPlayers = ZapGoat.getBoard().getNumPlayers();
        int step = ZapGoat.getBoard().getStep();
        marketResources.changeQuantity(replenishRate[numPlayers][step]);
    }

    public void purchase(int[] quantities, Player buyer) {

    }

    public int getCoal() {
        return marketResources.getCoal();
    }

    public int getOil() {
        return marketResources.getOil();
    }

    public int getGarbage() {
        return marketResources.getGarbage();
    }

    public int getUranium() {
        return marketResources.getUranium();
    }

}
