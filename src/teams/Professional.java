package teams;

public class Professional extends Team {

    public final String teamLevel = "Professional";

    public Professional(String name, String budget, String sponsor) {
        this.setName(name);
        this.setSponsor(sponsor);
        this.setBudget(budget);
        this.setTeamStage(teamLevel);
    }
}
