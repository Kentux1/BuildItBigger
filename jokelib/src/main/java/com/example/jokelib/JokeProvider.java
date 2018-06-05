package com.example.jokelib;

import java.util.Random;

import static com.example.jokelib.Jokes.jokes;

public class JokeProvider {

    public static String tellRandomJoke() {
        int size = jokes.length;

        Random r = new Random();
        int index = r.nextInt(size);

        return jokes[index];
    }
}
