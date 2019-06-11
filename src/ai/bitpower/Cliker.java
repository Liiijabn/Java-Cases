package ai.bitpower;

public class Cliker implements Runnable {

    int click = 0;
    Thread t;

    private volatile boolean running = true;

    public Cliker(int p) {
        t = new Thread(this);
        t.setPriority(p);
    }

    public void run() {
        while (running) {
            click++;
        }
    }

    public void stop() {
        running = false;
    }

    public void start() {
        t.start();
    }

}
