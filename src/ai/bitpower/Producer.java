package ai.bitpower;

public class Producer implements Runnable {
    Q q;

    Producer(Q q){
        this.q = q;
        new Thread(this, "Producer").start();
    }

    @Override
    public void run() {
        int i =0;
        while (i < 10){
            q.put(i++);
        }
    }
}
