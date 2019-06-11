package ai.bitpower;

public class Synch {
    public static void main(String args[])  {
        Callme target = new Callme();
        Caller c1 = new Caller(target, "hello");
        Caller c2 = new Caller(target, "Synchronized");
        Caller c3 = new Caller(target, "World");

        try{
            c1.t.join();
            c2.t.join();
            c3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}
