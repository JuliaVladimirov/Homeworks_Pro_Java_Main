package org.example.task2;

public class Egg_Thread extends Thread{

    private boolean isPaused = false;

    public boolean isPaused() {
        return isPaused;
    }

    public void setPaused(boolean paused) {
        isPaused = paused;
    }

    public void run() {
        Thread.currentThread().setName("Thread Egg");

        while (!Thread.interrupted()) {
            System.out.println("Яйцо");
            while (isPaused){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println(Thread.currentThread().getName() + " был прерван.");
                    if (Thread.interrupted()){
                        return;
                    }
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " был прерван.");
                return;
            }
        }
    }
}
