
package org.example;

import java.util.concurrent.locks.ReentrantLock;

public class Fork {
    private ReentrantLock lock;
    private int id;

    public Fork(int id) {
        this.lock = new ReentrantLock();
        this.id = id;
    }

    public void pickUp() {
        lock.lock();
    }

    public void putDown() {
        lock.unlock();
    }

    public int getId() {
        return this.id;
    }
}
