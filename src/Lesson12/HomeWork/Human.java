package Lesson12.HomeWork;

public class Human extends Players{
    private final int jumpLimit;
    private final int runLimit;
    private final int playerID;
    private boolean played = true;

    public boolean isPlayed() {
        return played;
    }

    public void setPlayed(boolean played) {
        this.played = played;
    }

    public int getPlayerID() {
        return playerID;
    }

    public int getJumpLimit() {
        return jumpLimit;
    }

    public int getRunLimit() {
        return runLimit;
    }

    public Human(int jumpLimit, int runLimit, int playerID) {
        this.jumpLimit = jumpLimit;
        this.runLimit = runLimit;
        this.playerID = playerID;
    }

    @Override
    public boolean equals(Object obj) {
        return this.getClass().equals(obj.getClass());
    }
}
