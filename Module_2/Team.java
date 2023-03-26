public class Team {

    private String teamName;
    private String[] players;
    private int playerCount;

    public Team() {
        teamName = "";
        players = new String[20];
        playerCount = 0;
    }

    public Team(String teamName, String[] players, int playerCount) {
        this.teamName = teamName;
        this.players = players;
        this.playerCount = playerCount;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String[] getPlayers() {
        return players;
    }

    public void setPlayers(String[] players) {
        this.players = players;
        setPlayerCount(getPlayers().length);
    }

    public int getPlayerCount() {
        return playerCount;
    }

    public void setPlayerCount(int playerCount) {
        this.playerCount = playerCount;
    }

}