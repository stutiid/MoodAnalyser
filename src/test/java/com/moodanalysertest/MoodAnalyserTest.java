package com.moodanalysertest;

import com.moodanalyserlogic.MoodAnalyser;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    MoodAnalyser moodAnalyser = new MoodAnalyser();

    @Test
    public void givenSadMessageShouldReturnSad() {
        String result = moodAnalyser.analyseMood("I am in sad mood");
        Assert.assertEquals("SAD", result);
    }

    @Test
    public void givenAnyMessageShouldReturnHappy() {
        String result = moodAnalyser.analyseMood("I am blue");
        Assert.assertEquals("HAPPY", result);
    }

    @Test
    public void givenHappyMessageShouldReturnHappy() {
        String result = moodAnalyser.analyseMood("I am Happy");
        Assert.assertEquals("HAPPY", result);
    }
}
