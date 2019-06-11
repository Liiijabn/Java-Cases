package ai.bitpower;

public class Caller implements Runnable {
    String msg;
    Callme target;
    Thread t;

    public Caller(Callme target, String s) {
        this.target = target;
        msg = s;
        t = new Thread(this);
        t.start();
    }

    public void run() {
        synchronized (target) {
            target.call(msg);
        }
    }
}
