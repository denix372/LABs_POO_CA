package lab5.task1;

public class Test1 {
    public static void main(String[] args) {
        Task t1 = new OutTask("OutTask apelat");
        t1.execute();

        Task t2 = new RandomOutTask();
        t2.execute();
        Task t3 = new RandomOutTask();
        t3.execute();

        Task t4 = new CounterOutTask();
        t4.execute();
        Task t5 = new CounterOutTask();
        t5.execute();
    }

}
