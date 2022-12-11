package main;

public enum Action {
    Attaque("Attaque"), Defense("Defense");
    private String action;
    private Action(String action){
        this.action = action;
    }
    public String getAction() {
        return this.action;
    }
}
