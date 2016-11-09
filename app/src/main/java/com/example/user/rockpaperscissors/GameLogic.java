package com.example.user.rockpaperscissors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;

/**
 * Created by user on 09/11/2016.
 */

public class GameLogic {

    private static final HashMap<String, String> WIN_AGAINST;
    static {
        WIN_AGAINST = new HashMap<>();
        WIN_AGAINST.put( "ROCK", "SCISSORS" );
        WIN_AGAINST.put( "PAPER", "ROCK" );
        WIN_AGAINST.put( "SCISSORS", "PAPER" );
    }

    public static int getWinner(String hand1, String hand2){
        if (hand1.equals(hand2)){
            return 0;
        }
        String hand1Beats = WIN_AGAINST.get(hand1);
        if (hand2.equals(hand1Beats)){
            return 1;
        }
        return 2;

    }

    public static String getRandomHand() {

        Object[] options = WIN_AGAINST.keySet().toArray();

        Random rand = new Random();
        int randIndex = rand.nextInt( options.length );

        String result = (String) options[randIndex];

        return result;
    }
}