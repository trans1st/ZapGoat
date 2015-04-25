public class Board {

    private int numPlayers,
    //Number of players in this game

                phase,
    //Current phase

                step;
    //Current step of the game

    private Player[] players;

    public Board(int numberOfPlayers) {
        phase = 1;
        numPlayers = numberOfPlayers;
        players = new Player[numPlayers];
        step = 1;
    }

    public int getNumPlayers() {
        return numPlayers;
    }

    public int getPhase() {
        return phase;
    }

    public int getStep() {
        return step;
    }

}
