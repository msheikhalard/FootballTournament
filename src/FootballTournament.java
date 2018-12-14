import teams.Team;
import teams.Professional;
import teams.Amateur;
import java.util.ArrayList;
import java.util.Collections;

import rounds.Round;
import rounds.RoundController;

public class FootballTournament {

    public static void main(String[] args) {

        String[] professionalListName = {"Arsenal F.C.", "Chelsea F.C.", "Real Madrid C.F.", "Liverpool.F.C"};
        String[] professionalListSponsor = {"Fly Emirates", "Nike", "Adidas", "Visa"};
        String[] professionalListBudget =  {"10000 Euros","11000 Euros","12000 Euros","13000 Euros"};

        String[] amateurListName = {"FC Barcelona", "Inter Milan", "Atletico Madrid", "FC Bayern Munich"};
        String[] amateurListHomeBar = {"Coca-Cola Bar", "Pepsi Bar", "McDonalds Bar", "Hard Rock"};
        String[] amateurListMascotte = {"Husky Mascotte", "Kangaroo Mascotte", " Bird Mascotte", "Crocodile Mascotte"};

        ArrayList<Team> fullTeamsList = new ArrayList<>();

        for (int i = 0; i < professionalListName.length; i++) {
            fullTeamsList.add(new Professional(professionalListName[i], professionalListSponsor[i], professionalListBudget[i]));
        }
        for (int i = 0; i < amateurListName.length; i++) {

            fullTeamsList.add(new Amateur(amateurListName[i], amateurListHomeBar[i], amateurListMascotte[i]));
        }

        Collections.shuffle(fullTeamsList);

        Round round = new Round("One");
        Round round2 = new Round("Two");
        Round round3 = new Round("Three");


        RoundController.startTournament(fullTeamsList);
        ArrayList<Team> round1Winners = RoundController.roundResults(round, fullTeamsList);
        ArrayList<Team> round2Winners = RoundController.roundResults(round2, round1Winners);
        ArrayList<Team> round3Winners = RoundController.roundResults(round3, round2Winners);

        RoundController.endTournament(round3Winners.get(0));
    }
}
