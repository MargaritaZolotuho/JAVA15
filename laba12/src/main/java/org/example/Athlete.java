package org.example;

import java.util.List;

public class Athlete {
    private int id;
    private String name;
    private String sport;
    private int level;
    private List<Integer> competitionResults;

    public Athlete(int id, String name, String sport, int level, List<Integer> competitionResults) {
        this.id = id;
        this.name = name;
        this.sport = sport;
        this.level = level;
        this.competitionResults = competitionResults;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSport() {
        return sport;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public List<Integer> getCompetitionResults() {
        return competitionResults;
    }

    public double getAverageResult() {
        if (competitionResults == null || competitionResults.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (int result : competitionResults) {
            sum += result;
        }
        return (double) sum / competitionResults.size();
    }

}


