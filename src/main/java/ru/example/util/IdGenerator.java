package ru.example.util;

import java.util.Random;

public class IdGenerator {

    public static int generateRandomId() {

        final Random random = new Random();
        return random.nextInt();
    }
}
