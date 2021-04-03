package com.moodanalyserlogic;

public class MoodAnalyser {
    public String analyseMood(String message) {
        if ((message.contains("SAD")) || (message.contains("sad")))
            return "SAD";
        return "HAPPY";
    }
}
