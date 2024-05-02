package org.example;
public class Main {
    public static void main(String[] args) {

        int philosofersCount = 20;
        Fork[] forks = new Fork[philosofersCount];
        Philosopher[] philosophers = new Philosopher[philosofersCount];

        for (int i = 0; i < philosofersCount; i++) {
            forks[i] = new Fork(i);
        }

        for (int i = 0; i < philosofersCount; i++) {
            Fork leftFork = forks[i];
            Fork rightFork = forks[(i + 1) % philosofersCount];
            philosophers[i] = new Philosopher(leftFork, rightFork, i);
        }

        for (Philosopher philosopher : philosophers) {
            philosopher.start();
        }

    }
}