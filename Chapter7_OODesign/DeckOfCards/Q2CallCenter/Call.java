package Chapter7OODesign.DeckOfCards.Q2CallCenter;

public class Call {
    private Caller caller;
    private Employee handler;
    private Rank rank;

    public Call(Caller c) {
        rank = Rank.Repondent;
        caller = c;
    }

    public Rank incrementRank() {
        if (rank == Rank.Repondent) {
            rank = Rank.Manager;
        } else if (rank == Rank.Manager) {
            rank = Rank.Director;
        }
        return rank;
    }

    public void disconnect() {
        System.out.print("Call Disconnected");
    }

}
