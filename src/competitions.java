import GroceryList.Input;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class competitions {

    public static void main(String[] args) {
        ArrayList<String> team1 = new ArrayList<>() {
        };
        team1.add("HTML");
        team1.add("C#");
        ArrayList<String> team2 = new ArrayList<>() {
        };
        team2.add("C#");
        team2.add("Python");
        ArrayList<String> team3 = new ArrayList<>() {
        };
        team3.add("Python");
        team3.add("HTML");

        ArrayList<ArrayList<String>> competitions = new ArrayList<>();
        competitions.add(team1);
        competitions.add(team2);
        competitions.add(team3);


        ArrayList<Integer> results = new ArrayList<>();
        results.add(0);
        results.add(1);
        results.add(1);


        System.out.println("Winner is " + tournamentWinner(competitions, results));
    }

    public static String tournamentWinner(
            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        String currentTeam = "";
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put(currentTeam, 0);

        for (int idx = 0; idx < competitions.size(); idx++) {
            ArrayList<String> competition = competitions.get(idx);
            int result = results.get(idx);

            String homeTeam = competition.get(0);
            String awayTeam = competition.get(1);

            String winningTeam = (result == 1) ? homeTeam : awayTeam;
            updateScores(winningTeam, 3, scores);

            if(scores.get(winningTeam) > scores.get(currentTeam)){
                currentTeam = winningTeam;
            }

        }


        return currentTeam;
    }

    private static void updateScores(String team, int points, HashMap<String, Integer> scores) {

        if (!scores.containsKey((team))) {
            scores.put(team, 0);
        }

        scores.put(team, scores.get(team) + points);
    }
}
