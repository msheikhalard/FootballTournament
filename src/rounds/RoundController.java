package rounds;

import teams.Team;

import java.util.ArrayList;

public class RoundController {


    public static void startTournament(ArrayList<Team> teamList) {

        String newLine = System.lineSeparator();

        System.out.println("All Teams Info: " + newLine);
        teamList.forEach(team -> System.out.println("Team Name: " + team.getName() + " , Sponsored by: " + team.getSponsor() + " , Mascotte type: " + team.getMascotte() + "Level: " + team.getTeamStage()));
    }

    public static ArrayList<Team> roundResults(Round round, ArrayList<Team> teamList) {

        System.out.println("\n \n__________________________Round " + round.name + "__________________________\n\n");


        ArrayList<Team> firstTeamsGroup = new ArrayList<>();
        ArrayList<Team> secondTeamsGroup = new ArrayList<>();

        for (int i = 0; i < teamList.size(); i = i + 2) {
            firstTeamsGroup.add(teamList.get(i));
            secondTeamsGroup.add(teamList.get(i+1));
        }

        ArrayList<Team> winingTeams = new ArrayList<>();

        for (int i = 0; i < firstTeamsGroup.size(); i++) {
            System.out.println("\n          Game " + (i + 1) + ": ");
            System.out.println(firstTeamsGroup.get(i).getName() + " VS " + secondTeamsGroup.get(i).getName());


            if (firstTeamsGroup.get(i).getTeamStage().equals(secondTeamsGroup.get(i).getTeamStage())){
                int team1Score = 1 + (int) (Math.random() * ((10 - 1) + 1));
                int team2Score = 1 + (int) (Math.random() * ((10 - 1) + 1));

                if (team1Score > team2Score) {
                    winingTeams.add(firstTeamsGroup.get(i));
                    System.out.println("Score: "+ team1Score + "           "+ team2Score);
                } else if (team1Score < team2Score) {
                    winingTeams.add(secondTeamsGroup.get(i));
                    System.out.println("Score: "+ team2Score + "           "+ team1Score);
                } else {
                    winingTeams.add(secondTeamsGroup.get(i));
                    System.out.println("Score: "+ team2Score + "           "+ team1Score);
                }
            } else {
                int team2Score = 1 + (int) (Math.random() * ((10 - 1) + 1));
                int team1Score = 1 + (int) (Math.random() * ((10 - 1) + 1));

                if (team1Score > team2Score) {
                    winingTeams.add(firstTeamsGroup.get(i));
                    System.out.println("Score: "+ team1Score + "           "+ team2Score);
                } else if (team1Score < team2Score) {
                    winingTeams.add(secondTeamsGroup.get(i));
                    System.out.println("Score: "+ team2Score + "           "+ team1Score);
                } else {
                    winingTeams.add(firstTeamsGroup.get(i));
                    System.out.println("Score: "+ team1Score + "           "+ team2Score);
                }
            }
        }

        System.out.println("\n\n ///////////-------------/////////// Rond " + round.name + " Winning Teams ///////////-------------/////////// \n\n ");
        winingTeams.forEach(team -> System.out.println("Team Name: " + team.getName() + " , Sponsored by: " + team.getSponsor()+ " , Team Budget: " + team.getBudget() + " , Mascotte type: " + team.getMascotte() + " , Level: " + team.getTeamStage() ));
        return winingTeams;
    }

    public static void endTournament(Team team) {
        String newLine = System.lineSeparator();
        System.out.println("\n\n ------------- Winning Team ------------- \n\n ");
        System.out.println("Team Name: " + team.getName() + newLine + "Sponsored by: " + team.getSponsor() + newLine + "Team Budget: " + team.getBudget() + newLine + "Mascotte type: " + team.getMascotte() + newLine + "Level: " + team.getTeamStage() );

    }
}
