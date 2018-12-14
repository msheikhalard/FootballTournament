package teams;

public class Amateur extends Team {
    public final String teamLevel = "Amateur";

    public Amateur(String name, String homeBar, String mascotte) {
        this.setName(name);
        this.setHomeBar(homeBar);
        this.setMascotte(mascotte);
        this.setTeamStage(teamLevel);
    }
}
