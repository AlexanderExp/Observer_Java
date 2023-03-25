package org.example;

public class Game {
    private String title;
    private String achievements;
    private String techInfo;
    private String mainInfo;
    public Game(String title, String achievements, String techInfo, String mainInfo) {
        this.title = title;
        this.achievements = achievements;
        this.techInfo = techInfo;
        this.mainInfo = mainInfo;
    }

    public String getTitle() {
        return title;
    }

    public String getAchievements() {
        return achievements;
    }

    public String getTechInfo() {
        return techInfo;
    }

    public String getMainInfo() {
        return mainInfo;
    }
}