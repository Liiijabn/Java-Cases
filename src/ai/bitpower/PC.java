package ai.bitpower;

public class PC {
    public static void main (String args[]){
        Q q = new Q();
        new Producer(q);
        new Consumer(q);
    }
}