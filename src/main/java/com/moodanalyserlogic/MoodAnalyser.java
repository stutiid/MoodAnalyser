package com.moodanalyserlogic;

/*@Description:- analyse the mood of user by checking the message entered by user*/
public class MoodAnalyser {

    /*@Description:- it analyses the user mood by checking if the message given by user
     * contains word sad or happy and return the mood value according to it
     *@param:- message from user is passed as parameter to method
     *@return String:- return sad if message contains word sad else return happy even
     * if it did not contain happy word*/
    public String analyseMood(String message) {
        if ((message.contains("SAD")) || (message.contains("sad")))
            return "SAD";
        return "HAPPY";
    }
}
