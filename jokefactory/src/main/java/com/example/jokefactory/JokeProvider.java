package com.example.jokefactory;

import java.util.ArrayList;
import java.util.Random;

public class JokeProvider {

    private ArrayList<String> jokes;
    private Random randomGenerator;

    public JokeProvider(){
        jokes = new ArrayList<>();
        randomGenerator = new Random();

        jokes.add("Q: Why did the chicken cross the road?\nA: To get to the other side");
        jokes.add("Q: Why did the skeleton go to the ball alone?\nA: Because he had no body to go with");
        jokes.add("Q: What do you call a fish with no eyes?\nA: fsh!");
        jokes.add("Q: Why did the tomato blush?\nA: Because he saw the salad dressing");
    }

    public String getJoke(){
        int jokeIndex = randomGenerator.nextInt(jokes.size());
        return jokes.get(jokeIndex);
    }
}
