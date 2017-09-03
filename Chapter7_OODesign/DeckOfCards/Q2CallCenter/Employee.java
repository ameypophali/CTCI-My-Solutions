package Chapter7OODesign.DeckOfCards.Q2CallCenter;

abstract class Employee {
    private Call currentCall = null;
    private Rank rank;
    private Callhandler callhandler;

    public Employee(Callhandler callhandler){
        this.callhandler = callhandler;
    }

    public Call getCurrentCall() {
        return currentCall;
    }

    public void setCurrentCall(Call currentCall) {
        this.currentCall = currentCall;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public boolean isFree(){
        return currentCall == null;
    }

    public void receiveCall(Call call){
        currentCall = call;
    }

    public void completedCall(){
       currentCall.disconnect();
       currentCall = null;

       assignNewCall();
    }

    private boolean assignNewCall(){
        if(!isFree()){
            return false;
        }
       return callhandler.assignCall(this);
    }
}
