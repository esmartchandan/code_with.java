public class Counter {
    public static int count = 0;
    Counter(){
        incrementCounter();
    }
    static void incrementCounter(){
        count++;
    }
    void showCounter(){
        System.out.println("the current count is " + count);
    }
    public static void main(String[] args) {
        Counter c1 = new Counter();
        c1.showCounter();
        Counter c2 = new Counter();
        c2.showCounter();
        Counter c3 = new Counter();
        c3.showCounter();
    }
}

