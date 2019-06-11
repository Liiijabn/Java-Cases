package ai.bitpower;
import static java.lang.Math.abs;

public final class Dog {

    protected static class puppy {

        public void hobby(){
            System.out.println("puppy's hobby");
        }
    }

    public String name;

    public int age;

    public void bark() {
        System.out.println("wang wang ..");
    }

    protected Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {

        return "Dog's name is " + this.name + ", age is " + this.age;
    }

    public static void main(String[] args) {

//        System.out.println("Dog");


//        new B(new A());

        BB bb = new BB();

        bb.printName();

//        System.out.println(bb.getName());
//
//        bb.hello();
//        B.hello();
//        BB.hello();
    }
}

class A {
    public static final int i = 10;

//    static {
//        i = 10;
//    }

    public A() {
        new B(this).print();
    }

    public void print() {
        System.out.println("Hello From A");
    }

    public int sum(int a, int b){
        int c = StrictMath.abs(a)+StrictMath.abs(b);
        return abs(a) + abs(b) + c;
    }
}

class B {
    A a;

    private final String name = "this is B";

    public B(){

    }

    public B(A a) {
        this.a = a;
    }

    public String getName(){
        return name;
    }

    public void print() {
        System.out.println("Hello From B");
        a.print();
        System.out.println(A.i);
    }

    public static void hello ()
    {
        System.out.println("hello from B");
    }
}

class BB extends B {

//    public static void hello ()
//    {
//        System.out.println("hello from BB");
//    }
//
//    BB(){
//
//    }

    public void printName(){
        System.out.println(this.getName());
    }

    public String getName(){
        return "this is BB";
    }
}