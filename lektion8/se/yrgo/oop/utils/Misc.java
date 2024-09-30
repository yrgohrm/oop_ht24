package se.yrgo.oop.utils;

import java.util.concurrent.ThreadLocalRandom;

public class Misc {
    public static int num() {
        return ThreadLocalRandom.current().nextInt(22);
    }
}
