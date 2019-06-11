package ai.bitpower;


import javafx.collections.transformation.SortedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class Demo {

//    private int size;

//    private class Inner {
//        private int counter;
//        public void doSth(){
//            size++;
//        }
//    }

    public static void main(String[] args) {

        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        Cliker hi = new Cliker(Thread.NORM_PRIORITY + 2);
        Cliker lo = new Cliker(Thread.NORM_PRIORITY - 2);
        lo.start();
        hi.start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        lo.stop();
        hi.stop();
        // Wait for child threads to terminate.
        try {
            hi.t.join();
            lo.t.join();
        } catch (InterruptedException e) {
            System.out.println("InterruptedException caught");
        }

        System.out.println("Low-priority thread: " + lo.click);
        System.out.println("High-priority thread: " + hi.click);

//        Thread t = Thread.currentThread();
//        System.out.println("current thread: " + t);
//
//        t.setName("My Thread");
//        System.out.println("After name change: "  + t);
//
//        try {
//            for (int i = 10; i > 0; i--) {
//                System.out.println(i);
//                Thread.sleep(1000);
//            }
//        } catch (InterruptedException e) {
//            System.out.println("Main thread interrupted");
//        }

//        NewThread t1 = new NewThread();
//        NewThread t2 = new NewThread();
//        NewThread t3 = new NewThread();
//        t1.t.setName("t1");
//        t2.t.setName("t2");
//        t3.t.setName("t3");
////        t1.t.setPriority(Thread.MIN_PRIORITY);

//        try {
//            System.out.println("Waiting for threads to finish.");
//            t1.t.join();
//            t2.t.join();
//            t3.t.join();
//        } catch (InterruptedException e) {
//            System.out.println("Main thread interrupted");
//        }
//        System.out.println("Thread One is alive: "+ t1.t.isAlive());
//        System.out.println("Thread Two is alive: "+ t2.t.isAlive());
//        System.out.println("Thread Three is alive: "+ t3.t.isAlive());
//        System.out.println("Main thread exiting.");
//        System.out.println("Main Thread exit");


//        int x = 10;
//        int y = 0123;
//
//        System.out.println(x);
//        System.out.println(y);
//
//
//        int i, j;
//        for (i = 1; i <= 9; i++) {
//            for (j = 1; j <= 9; j++) {
//                if (j < i) {
//                    //打印八个空格，去掉空格就是左上三角形
//                    System.out.print("        ");
//                } else {
//                    System.out.printf("%d*%d=%2d  ", i, j, i * j);
//                }
//            }
//            System.out.print("\n");
//        }
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("输入年份：");
//        int year = sc.nextInt();
//
//        System.out.println("输入月份：");
//        int month = sc.nextInt();
//
//        int days = 0;
//
//        switch (month) {
//            case 1:
//            case 3:
//            case 5:
//            case 7:
//            case 8:
//            case 10:
//            case 12:
//                days = 31;
//                break;
//            case 4:
//            case 6:
//            case 9:
//            case 11:
//                days = 30;
//                break;
//            case 2:
//                // 判断闰年
//                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
//                    days = 29;
//                else
//                    days = 28;
//                break;
//            default:
//                System.out.println("月份输入错误！");
//                System.exit(0);  // 强制结束程序
//        }
//        System.out.printf("天数：%d\n", days);

        // 静态初始化
        // 静态初始化的同时就为数组元素分配空间并赋值
//        int intArray[] = new int[5];
//        long total = 0;
//        int len = intArray.length;
//
//        // 给数组元素赋值
//        System.out.print("请输入" + len + "个整数，以空格为分隔：");
//        Scanner sc = new Scanner(System.in);
//        for(int i=0; i<len; i++){
//            intArray[i] = sc.nextInt();
//        }
//
//        // 计算数组元素的和
//        for(int i=0; i<len; i++){
//            total += intArray[i];
//        }
//
//        System.out.println("所有数组元素的和为：" + total);
//        System.out.println("所有数组元素为：");
//
//        for (int i: intArray) {
//            System.out.print(i + ", ");
//        }

        // 第一个矩阵（动态初始化一个二维数组）
//        int a[][] = new int[2][3];
//        // 第二个矩阵（静态初始化一个二维数组）
//        int b[][] = {{1, 5, 2, 8}, {5, 9, 10, -3}, {2, 7, -5, -18}};
//        // 结果矩阵
//        int c[][] = new int[2][4];
//
//        System.out.println(b.length);
//
//        // 初始化第一个矩阵
//        for (int i = 0; i < 2; i++)
//            for (int j = 0; j < 3; j++)
//                a[i][j] = (i + 1) * (j + 2);
//
//        // 计算矩阵乘积
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 4; j++) {
//                c[i][j] = 0;
//                for (int k = 0; k < 3; k++)
//                    c[i][j] += a[i][k] * b[k][j];
//            }
//        }
//        // 输出结算结果
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 4; j++)
//                System.out.printf("%-5d", c[i][j]);
//            System.out.println();
//        }
//
//        int d[][][] = new int[2][3][4];
//
//        System.out.println(d.length);
//
//        ArrayList e = new ArrayList(3);
//
//        e.add(1);
//        e.add(2);
//        e.add(3);
//
//        for (Object ee: e){
//            System.out.println(ee);
//        }

//        String str = "wei_xue_yuan_is_good";
//        String[] strArr = str.split("_");
//        System.out.println(Arrays.toString(strArr));
//
//        int[] a = {1, 3, 5, 2, 4, 9, 8, 7, 6};
//
//        Arrays.sort(a);
//
//        System.out.println(Arrays.toString(a));
//
//        StringBuffer strBuffer = new StringBuffer();
//        strBuffer.append("abd");
//        strBuffer.append("adfadfadfadf");
//
//        System.out.println(strBuffer);
//

//        Aclass a = new Aclass();
//
//        System.out.println(a);
//
//        Demo d = new Demo();
//
//        d.print();
////        System.out.println();

//        Dog myDog = new Dog("Leo", 2);
//        myDog.bark();
//        System.out.println(myDog);
//
//        for (int i = 0 ; i < 10; i++){
//            System.out.println(i + ", ");
//        }

//        System.out.println("i: " + i);

//        Short s = new Short("2");
//        System.out.println(s.doubleValue());
//
//        Short ss = new Short(s.shortValue());
//
//        System.out.println(ss.equals(s));
//
//        short st = 12;
//        Short sss = new Short(st);
//
//        System.out.println(sss.toString());

//        String str[] = {"123", "123abc", "abc123", "abcxyz"};
//
//        for (String str1 : str) {
//            try {
//                int m = Integer.parseInt(str1, 10);
//                System.out.println(str1 + " 可以转换为整数 " + m);
//            } catch (Exception e) {
//                System.out.println(str1 + " 无法转换为整数:" + e.toString());
//            }
//        }

//        Demo demo = new Demo();
//        Inner inner = demo.new Inner();
//
//        inner.doSth();
//
//        System.out.println(demo.size);
//        System.out.println(inner.counter);
//
//        Dog dog = new Dog("my Dog", 2);
////        Dog.puppy puppy = dog.new puppy();
//        Dog.puppy pu = new Dog.puppy();
//
////        puppy.hobby();
//        pu.hobby();


//        System.out.println();

//        Arrays.asList( "a", "b", "d" ).forEach( e -> System.out.println( e ) );
////
//        String name = "Teacher";
//
//        People t  = new Teacher();
//        Driver d = new Driver();
//
//        t.setName("李老师");
//        t.work();
//
//        d.setName("小李");
//        d.work();

//        Point <Integer, Integer> p1 = new Point();
//
////        p1.setX(10);
////        p1.setY(20);
////        int x = p1.getX();
////        int y = p1.getY();
////        System.out.println("This point is：" + x + ", " + y);
//        p1.printPoint(10, 20);
//
//        Point<Double, String> p2 = new Point();
////        p2.setX(25.4);
////        p2.setY("东京180度");
////        double m = p2.getX();
////        String n = p2.getY();
////        System.out.println("This point is：" + m + ", " + n);
//        p2.printPoint(25.4, "东京180度");

//        int d = 0;
//        int a = 42 / d;

//        try {
//            System.out.println(Demo.de(42, 0));
//        } catch (Exception e) {
//            System.out.println("Exception: " + e.getMessage());
//        } finally {
//            System.out.println("hello");
//        }

//        int x = 10;
//
//        assert x > 15 : "assert fail ";
//
//        System.out.println(x);


    }


//    public static double de(double a, double b) throws Exception {
//
//        if (b == 0) {
//            throw new Exception("b can not be 0");
//        }
//
//        return a / b;
//    }
}

//class Point<T1, T2>{
//    T1 x;
//    T2 y;
//    public T1 getX() {
//        return x;
//    }
//    public void setX(T1 x) {
//        this.x = x;
//    }
//    public T2 getY() {
//        return y;
//    }
//    public void setY(T2 y) {
//        this.y = y;
//    }
//    // 定义泛型方法
//    public <T3 extends Number, T4> T3 printPoint(T3 x, T4 y){
////        T1 m = x;
////        T2 n = y;
//        T3 t3  = x;
//
//        System.out.println("This point is：" + x + ", " + y);
//
//        return t3;
//    }
//}

// 定义一个抽象类
//abstract class People{
//    private String name;  // 实例变量
//
//    // 共有的 setter 和 getter 方法
//    public void setName(String name){
//        this.name = name;
//    }
//    public String getName(){
//        return this.name;
//    }
//
//    // 抽象方法
//    public abstract void work();
//}
//class Teacher extends People{
//    // 必须实现该方法
//    public void work(){
//        System.out.println("我的名字叫" + this.getName() + "，我正在讲课，请大家不要东张西望...");
//    }
//}
//class Driver extends People{
//    // 必须实现该方法
//    public void work(){
//        System.out.println("我的名字叫" + this.getName() + "，我正在开车，不能接听电话...");
//    }
//}

//
//class Aclass {
//
//}