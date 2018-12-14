package teams;

public class Team {
    private String name;
    private String teamStage;
    private String budget;
    private String sponsor;
    private String mascotte;
    private String homeBar;

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    public String getHomeBar() {
        return homeBar;
    }

    public void setHomeBar(String homeBar) {
        this.homeBar = homeBar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeamStage() {
        return teamStage;
    }

    public void setTeamStage(String teamStage) {
        this.teamStage = teamStage;
    }

    public String getSponsor() {
        return sponsor;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }

    public String getMascotte() {
        return mascotte;
    }

    public void setMascotte(String mascotte) {
        this.mascotte = mascotte;
    }
}
