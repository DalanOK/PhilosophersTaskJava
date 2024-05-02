package org.example;

public class Philosopher extends Thread{
    private Fork first;
    private Fork second;

    private int id;

    public Philosopher(Fork left, Fork right, int id) {
        if (left.getId() < right.getId()) {
            this.first = left;
            this.second= right;
        } else {
            this.first = right;
            this.second= left;
        }
        this.id = id;
    }

    public void run() {
        pickUp();
        putDown();
    }

    private void pickUp() {
        first.pickUp();
        System.out.println((id + 1) + "Picked up left fork");
        second.pickUp();
        System.out.println((id + 1) + " Picked up right fork. Eating");
    }

    private void putDown() {
        second.putDown();
        System.out.println((id + 1) + "Put down left fork");
        first.putDown();
        System.out.println((id + 1) + "Put down right fork. Back to thinking");
    }
}
